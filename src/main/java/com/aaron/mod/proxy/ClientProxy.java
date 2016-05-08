package com.aaron.mod.proxy;

import com.aaron.mod.render.RMBlockRender;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy  extends CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {

        super.preInit(preEvent);

    }
    public void init(FMLInitializationEvent event) {

        super.init(event);

        RMBlockRender.registerBlockRender();
    }
    public void postInit(FMLPostInitializationEvent postEvent) {

        super.postInit(postEvent);

    }
}
