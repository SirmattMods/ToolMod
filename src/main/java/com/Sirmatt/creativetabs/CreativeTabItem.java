package com.Sirmatt.creativetabs;

import com.Sirmatt.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItem extends CreativeTabs {

	public CreativeTabItem(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.Pinkite;
	}

}
