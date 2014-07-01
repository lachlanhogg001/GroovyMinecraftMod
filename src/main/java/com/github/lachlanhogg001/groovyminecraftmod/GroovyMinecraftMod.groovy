package com.github.lachlanhogg001.groovyminecraftmod

import com.github.lachlanhogg001.groovyminecraftmod.configuration.ConfigurationHandler
import com.github.lachlanhogg001.groovyminecraftmod.proxy.IProxy;
import com.github.lachlanhogg001.groovyminecraftmod.reference.Reference
import com.github.lachlanhogg001.groovyminecraftmod.utility.LogHelper
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
class GroovyMinecraftMod {

    @Mod.Instance(Reference.MOD_ID)
    static GroovyMinecraftMod instance

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    static IProxy proxy

    @Mod.EventHandler
    def preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile())
    }

    @Mod.EventHandler
    def init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    def postInit(FMLPostInitializationEvent event) {

    }

}
