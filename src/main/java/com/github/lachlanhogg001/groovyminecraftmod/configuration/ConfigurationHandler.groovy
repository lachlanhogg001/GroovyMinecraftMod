package com.github.lachlanhogg001.groovyminecraftmod.configuration

import net.minecraftforge.common.config.Configuration

class ConfigurationHandler {
    def static init(File configFile) {
        Configuration configuration = new Configuration(configFile)
        def configValue = false
        try {
            configuration.load()

            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true)
        }catch (Exception e) {

        }finally {
            configuration.save()
        }
    }
}
