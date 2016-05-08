package com.aaron.mod;

import com.aaron.mod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = RMGlobal.MOD_ID, name = RMGlobal.MOD_NAME, version = RMGlobal.VERSION)
public class Main {

    @Mod.Instance(RMGlobal.MOD_ID)
    public static Main instance;

    @SidedProxy(serverSide = RMGlobal.RM_COMMON_PROXY, clientSide = RMGlobal.RM_CLIENT_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent){

        this.proxy.preInit(preEvent);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        this.proxy.init(event);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){

        this.proxy.postInit(postEvent);

    }


}
