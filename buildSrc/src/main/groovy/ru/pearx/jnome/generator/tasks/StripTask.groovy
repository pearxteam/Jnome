package ru.pearx.jnome.generator.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.AbstractCopyTask
import org.gradle.api.tasks.TaskAction
import ru.pearx.jnome.generator.Generator

/*
 * Created by mrAppleXZ on 29.12.17 15:20.
 */

class StripTask extends DefaultTask
{
    File input
    File output
    List<String> whitelistFiles

    @TaskAction
    def strip()
    {
        new FileWriter(output.toString(), false).withCloseable { wr ->
            boolean pass = false
            input.eachLine { line ->
                if(line.startsWith("# "))
                {
                    pass = filter(Generator.parseFile(line))
                }
                if(pass)
                {
                    wr.write(line)
                    wr.write("\n")
                }
                else logger.debug("Stripping line " + line)
            }
        }
    }

    boolean filter(String s)
    {
        for(String wl : whitelistFiles)
        {
            if(s.startsWith(wl))
                return true
        }
        return false
    }
}
