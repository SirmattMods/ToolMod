package com.Sirmatt.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.Sirmatt.creativetabs.MCreativeTabs;
import com.Sirmatt.lib.RefStrings;
import com.Sirmatt.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class MItems {

	public static void mainRegistry(){
		initialiseItem();
		registerItem();
		
	}
	
	public static ToolMaterial PinkiteBuild = EnumHelper.addToolMaterial("Pinkite Dust", 3, 2000, 15, (float) 4.5, 10);
	public static ArmorMaterial PinkArmour = EnumHelper.addArmorMaterial("Pink Armour", 50, new int[]{4, 10, 4 ,2}, 10);
	
	public static Item Pinkite;
	public static Item PinkitePick;
	public static Item PinkiteAxe;
	public static Item PinkiteSword;
	public static Item PinkiteShovel;
	public static Item PinkiteHoe;

	
	public static void initialiseItem(){
		Pinkite = new Item().setUnlocalizedName("Pinkite").setCreativeTab(MCreativeTabs.tabItem).setTextureName(RefStrings.MODID + ":Pinkite");
		
		PinkitePick = new PinkitePick(PinkiteBuild).setUnlocalizedName("PinkPick").setCreativeTab(MCreativeTabs.tabTools).setTextureName(RefStrings.MODID + ":Pinkpickaxe");
		PinkiteAxe = new PinkiteAxe(PinkiteBuild).setUnlocalizedName("PinkAxe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(RefStrings.MODID + ":Pinkaxe");
		PinkiteSword = new PinkiteSword(PinkiteBuild).setUnlocalizedName("PinkSword").setCreativeTab(MCreativeTabs.tabTools).setTextureName(RefStrings.MODID + ":Pinksword");
		PinkiteShovel = new PinkiteShovel(PinkiteBuild).setUnlocalizedName("PinkShovel").setCreativeTab(MCreativeTabs.tabTools).setTextureName(RefStrings.MODID + ":Pinkshovel");
		PinkiteHoe = new PinkiteHoe(PinkiteBuild).setUnlocalizedName("PinkHoe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(RefStrings.MODID + ":Pinkhoe");
		
	}

	public static void registerItem(){
		GameRegistry.registerItem(Pinkite, Pinkite.getUnlocalizedName());
		GameRegistry.registerItem(PinkitePick, PinkitePick.getUnlocalizedName());
		GameRegistry.registerItem(PinkiteAxe, PinkiteAxe.getUnlocalizedName());
		GameRegistry.registerItem(PinkiteSword, PinkiteSword.getUnlocalizedName());
		GameRegistry.registerItem(PinkiteShovel, PinkiteShovel.getUnlocalizedName());
		GameRegistry.registerItem(PinkiteHoe, PinkiteHoe.getUnlocalizedName());

		
	}
}
