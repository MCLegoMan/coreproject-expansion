package com.mclegoman.coreprojectexpansion.common;

/*
 CoreProject: Expansion Pack 1.0.0
 https://github.com/MCLegoMan/coreproject-expansion

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public class CoreProjectExpansionStaticData {
    public static final String ID = "coreprojectexpansion";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "Core Project: Expansion Pack";
    public static final String PREFIX = "[" + NAME + " " + VERSION + "] ";
    public static final ModContainer CONTAINER = FabricLoader.getInstance().getModContainer(ID).get();

    public static void registerStaticData(){
        LegoLibStaticData.sendMessageToLog(PREFIX, "registering", "Static Data");
    }
}