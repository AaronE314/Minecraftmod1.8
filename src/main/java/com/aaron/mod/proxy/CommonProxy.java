package com.aaron.mod.proxy;

import com.aaron.mod.blocks.RMBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {

        RMBlocks.initBlocks();

    }
    public void init(FMLInitializationEvent event) {

    }
    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}
