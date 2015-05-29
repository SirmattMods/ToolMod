package com.Sirmatt.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	
	public static CreativeTabs tabBlocks;
	public static CreativeTabs tabItem;
	public static CreativeTabs tabTools;
	
		public static void initialiseTabs() {
			tabBlocks = new CreativeTabBlock("BlockTab");
			tabItem = new CreativeTabItem("ItemTab");
			tabTools = new CreativeTabTool("ToolTab");
	}

}
