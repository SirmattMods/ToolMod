package com.Sirmatt.blocks;

import com.Sirmatt.creativetabs.MCreativeTabs;
import com.Sirmatt.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MBlocks {


	public static void mainRegistry(){
		initialiseBlock();
		registerBlock();
	}

	public static Block PinkBlock;
	
	
	public static void initialiseBlock(){
		PinkBlock = new PinkBlock (Material.ground).setBlockName("PinkBlock").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(RefStrings.MODID + ":PinkBlock");
	
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(PinkBlock, PinkBlock.getUnlocalizedName());

	}
}
	
