package ru.pearx.jnome.generator.matchers

import ru.pearx.jnome.generator.GeneratorData

import java.util.regex.MatchResult
import java.util.regex.Pattern

/*
 * Created by mrAppleXZ on 30.12.17 14:40.
 */

class TypedefMethodMatcher implements IMatcher
{
    public static final Pattern PAT = Pattern.compile("\\s*?typedef\\s+?(.+?)\\s+?\\((.+?)\\)\\s+?\\((.+?)\\);", Pattern.DOTALL)
    @Override
    Pattern getPattern()
    {
        return PAT
    }

    @Override
    void process(MatchResult match, GeneratorData data)
    {

    }
}
