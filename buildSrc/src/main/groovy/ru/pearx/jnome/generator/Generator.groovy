package ru.pearx.jnome.generator

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/*
 * Created by mrAppleXZ on 29.12.17 15:20.
 */

class Generator implements Plugin<Project>
{
    Logger log

    void apply(Project proj)
    {
        log = LoggerFactory.getLogger("jnome-generator")
    }
}
