package ru.pearx.jnome.generator.matchers

import ru.pearx.jnome.generator.GeneratorData

import java.util.regex.MatchResult
import java.util.regex.Matcher
import java.util.regex.Pattern

/*
 * Created by mrAppleXZ on 30.12.17 9:38.
 */

class HeadMatcher implements IMatcher
{
    static final Pattern PAT = Pattern.compile("\\s*?# \\d*\\s\"(.*)\"(?: \\d*)?")

    @Override
    Pattern getPattern()
    {
        return PAT
    }

    @Override
    void process(MatchResult match, GeneratorData data)
    {
        data.processingFile = match.group(1)
    }
}
