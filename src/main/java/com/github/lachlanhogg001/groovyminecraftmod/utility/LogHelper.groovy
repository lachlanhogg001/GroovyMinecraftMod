package com.github.lachlanhogg001.groovyminecraftmod.utility

import cpw.mods.fml.common.FMLLog

import org.apache.logging.log4j.Level
import com.github.lachlanhogg001.groovyminecraftmod.reference.Reference

class LogHelper {
    def private static log(Level logLevel, def object) {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object))
    }

    def static all(def object) { log(Level.ALL, object) }

    def static debug(def object) { log(Level.DEBUG, object) }

    def static error(def object) { log(Level.ERROR, object) }

    def static fatal(def object) { log(Level.FATAL, object) }

    def static info(def object) { log(Level.INFO, object) }

    def static off(def object) { log(Level.OFF, object) }

    def static trace(def object) { log(Level.TRACE, object) }

    def static warn(def object) { log(Level.WARN, object) }
}
