package com.mclegoman.coreprojectexpansion.client;

/*
 CoreProject: Expansion Pack 1.0.0
 https://github.com/MCLegoMan/coreproject-expansion

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.coreprojectexpansion.client.registry.CoreProjectExpansionRegistryClient;
import com.mclegoman.coreprojectexpansion.common.CoreProjectExpansionStaticData;
import com.mclegoman.coreprojectexpansion.common.registry.CoreProjectExpansionResources;
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.api.ClientModInitializer;

public class CoreProjectExpansionClient implements ClientModInitializer {
    private static Boolean ClientInit = false;

    @Override
    public void onInitializeClient() {
        LegoLibStaticData.sendMessageToLog(CoreProjectExpansionStaticData.PREFIX, "info", "Initializing Client");
        CoreProjectExpansionRegistryClient.register();
        CoreProjectExpansionResources.registerResourcePacks();
        ClientInit = true;
    }
}
