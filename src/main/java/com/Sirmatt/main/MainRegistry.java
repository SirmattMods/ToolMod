package com.Sirmatt.main;

import com.Sirmatt.blocks.MBlocks;
import com.Sirmatt.creativetabs.MCreativeTabs;
import com.Sirmatt.item.MItems;
import com.Sirmatt.lib.RefStrings;
import com.Sirmatt.world.MWorld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		MCreativeTabs.initialiseTabs();
		MBlocks.mainRegistry();
		MItems.mainRegistry();
		MWorld.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void Load(FMLInitializationEvent Event){
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
	
}
