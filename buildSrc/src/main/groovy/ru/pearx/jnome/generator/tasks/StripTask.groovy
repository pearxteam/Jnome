package ru.pearx.jnome.generator.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.AbstractCopyTask
import org.gradle.api.tasks.TaskAction

/*
 * Created by mrAppleXZ on 29.12.17 15:20.
 */

class StripTask extends DefaultTask
{
    File input
    File output

    @TaskAction
    def strip()
    {
        println "testhaha"
    }
}
