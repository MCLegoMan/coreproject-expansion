package com.mclegoman.coreprojectexpansion.common.mixins;

/*
 CoreProject: Expansion Pack 1.0.0
 https://github.com/MCLegoMan/coreproject-expansion

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TradeOffers.EnchantBookFactory.class)
public class CoreProjectExpansionTradeOffersMixin {
    @Inject(method = "create", at = @At(value = "RETURN"), cancellable = true)
    public void replace(Entity entity, Random random, CallbackInfoReturnable<TradeOffer> cir) {
        int emeralds = 2 + random.nextInt(5 + MathHelper.nextInt(random, 1, 3) * 10) + 3 * MathHelper.nextInt(random, 1, 3);
        if (emeralds > 64) {
            emeralds = 64;
        }
        int maxuses = 1 + random.nextInt(2 + MathHelper.nextInt(random, 1, 2) * 5) + 2 * MathHelper.nextInt(random, 1, 2);
        if (maxuses > 12) {
            maxuses = 12;
        }
        cir.setReturnValue(new TradeOffer(new ItemStack(Items.EMERALD, emeralds), new ItemStack(Items.WRITABLE_BOOK), maxuses, 1, 0.2F));
    }
}