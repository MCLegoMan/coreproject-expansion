package com.mclegoman.coreprojectexpansion.server;

/*
 CoreProject: Expansion Pack 1.0.0
 https://github.com/MCLegoMan/coreproject-expansion

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.coreproject.common.registry.CoreProjectResources;
import com.mclegoman.coreprojectexpansion.common.CoreProjectExpansionStaticData;
import com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionBiomes;
import com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionConfiguredFeatures;
import com.mclegoman.coreprojectexpansion.common.features.CoreProjectExpansionPlacedFeatures;
import com.mclegoman.coreprojectexpansion.common.registry.CoreProjectExpansionItemGroups;
import com.mclegoman.coreprojectexpansion.common.registry.CoreProjectExpansionItems;
import com.mclegoman.coreprojectexpansion.common.registry.CoreProjectExpansionResources;
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.api.ModInitializer;

import java.util.ArrayList;

public class CoreProjectExpansionServer implements ModInitializer {
    private static Boolean ServerInit = false;
    private static final ArrayList<Runnable> runnables = new ArrayList<>(1);


    @Override
    public void onInitialize() {
        LegoLibStaticData.sendMessageToLog(CoreProjectExpansionStaticData.PREFIX, "info", "Initializing Server");
        CoreProjectExpansionStaticData.registerStaticData();
        CoreProjectExpansionItems.register();
        CoreProjectExpansionItemGroups.register();
        CoreProjectExpansionConfiguredFeatures.register();
        CoreProjectExpansionPlacedFeatures.register();
        CoreProjectExpansionBiomes.register();
        CoreProjectResources.registerDatapacks();
        CoreProjectExpansionResources.registerDatapacks();
        ServerInit = true;
        for (Runnable callback : runnables) {
            callback.run();
        }
    }

    public static void callbackWhenInitialized(Runnable callback) {
        if (ServerInit) {
            callback.run();
        } else {
            runnables.add(callback);
        }
    }
}
