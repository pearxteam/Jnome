package ru.pearx.jnome.generator.matchers

import ru.pearx.jnome.generator.GeneratorData

import java.util.regex.MatchResult
import java.util.regex.Matcher
import java.util.regex.Pattern

/*
 * Created by mrAppleXZ on 30.12.17 9:33.
 */

interface IMatcher
{
    Pattern getPattern()
    void process(MatchResult match, GeneratorData data)
}