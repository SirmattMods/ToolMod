package com.Sirmatt.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class MWorld {
	public static void mainRegistry(){
		initialiseWorldGen();
	}
	
	public static void initialiseWorldGen(){
		registerWorldGen(new SirOre(), 1);
	}
	
	public static void registerWorldGen(SirOre sirOre, int weightedProbability){
		GameRegistry.registerWorldGenerator(sirOre, weightedProbability);
	}
}

