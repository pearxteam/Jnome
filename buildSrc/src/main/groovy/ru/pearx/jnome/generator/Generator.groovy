package ru.pearx.jnome.generator

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.pearx.jnome.generator.matchers.HeadMatcher
import ru.pearx.jnome.generator.matchers.IMatcher
import ru.pearx.jnome.generator.matchers.TypedefMatcher
import ru.pearx.jnome.generator.matchers.TypedefMethodMatcher
import ru.pearx.jnome.generator.types.IType
import ru.pearx.jnome.generator.types.StandardTypes

/*
 * Created by mrAppleXZ on 29.12.17 15:20.
 */

class Generator implements Plugin<Project>
{
    public static final List<IType> TYPE_REGISTRY = new ArrayList<>()
    public static final List<IMatcher> MATCHER_REGISTRY = new ArrayList<>()

    void apply(Project proj)
    {
        TYPE_REGISTRY.add(new StandardTypes.Int8())
        TYPE_REGISTRY.add(new StandardTypes.Int16())
        TYPE_REGISTRY.add(new StandardTypes.Int32())
        TYPE_REGISTRY.add(new StandardTypes.Int64())
        MATCHER_REGISTRY.add(new HeadMatcher())
        MATCHER_REGISTRY.add(new TypedefMatcher())
        MATCHER_REGISTRY.add(new TypedefMethodMatcher())
    }

    static String parseFile(String line)
    {
        String[] vals = line.substring(2).split(" ")
        String file = vals[1]
        if (file.startsWith("\""))
            file = file.substring(1, file.length() - 1)
        return file
    }
}
