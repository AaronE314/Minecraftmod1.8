package com.aaron.mod.render;

import com.aaron.mod.RMGlobal;
import com.aaron.mod.blocks.RMBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class RMBlockRender {

    public static void registerBlockRender(){

        //Ores
        regBlock(RMBlocks.copperOre);
    }

    public static void regBlock(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0 , new ModelResourceLocation(RMGlobal.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
