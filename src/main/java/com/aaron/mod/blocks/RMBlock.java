package com.aaron.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RMBlock extends Block {

    public RMBlock(String unlocalizedName, Material material, float hardness, float resistance){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

}
