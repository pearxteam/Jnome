package ru.pearx.jnome.generator.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import ru.pearx.jnome.generator.Generator
import ru.pearx.jnome.generator.GeneratorData
import ru.pearx.jnome.generator.matchers.IMatcher
import ru.pearx.jnome.generator.types.IType

import java.util.regex.Matcher
import java.util.regex.Pattern

/*
 * Created by mrAppleXZ on 29.12.17 20:43.
 */

class GenerateTask extends DefaultTask
{
    File outputDir
    File inputFile

    @TaskAction
    void generate()
    {
        //todo streaming?
        String input = inputFile.getText("UTF-8")
        Map<Matcher, IMatcher> mts = new HashMap<>()
        for(IMatcher mat : Generator.MATCHER_REGISTRY)
            mts.put(mat.getPattern().matcher(input), mat)

        GeneratorData dat = new GeneratorData();

        boolean cont = true
        while(cont)
        {
            cont = false
            int start = -1;
            for (Map.Entry<Matcher, IMatcher> entr : mts)
            {
                if (entr.getKey().lookingAt())
                {
                    logger.warn(entr.getValue().getClass().toString() + " " + entr.getKey().toMatchResult())
                    entr.getValue().process(entr.getKey().toMatchResult(), dat)
                    start = entr.getKey().end()
                    cont = true
                    break
                }
            }
            if(start != -1)
            {
                for(Matcher mat : mts.keySet())
                    mat.region(start, input.length())
            }
        }
        logger.error("OH NOOOOOOO")
    }
}
