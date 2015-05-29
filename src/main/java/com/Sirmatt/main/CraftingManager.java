package com.Sirmatt.main;

import com.Sirmatt.blocks.MBlocks;
import com.Sirmatt.item.MItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//Shaped
		GameRegistry.addRecipe(new ItemStack(MBlocks.PinkBlock, 1), new Object[] {"XXX","XXX","XXX", 'X', MItems.Pinkite});       
		GameRegistry.addRecipe(new ItemStack(MBlocks.PinkBlock), new Object[] {"##", "##", '#', MItems.Pinkite});
		GameRegistry.addRecipe(new ItemStack(MItems.Pinkite, 16), new Object[] {"##", "##", '#', MBlocks.PinkBlock});
		//Shapeless
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1), new Object[] {"BMB", 'B', MItems.Pinkite, 'M', MBlocks.PinkBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.Pinkite), new Object[] {Items.redstone, Blocks.diamond_block, Items.apple});
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(Blocks.diamond_block, new ItemStack(MItems.Pinkite, 4), 20);
		
	}
}
