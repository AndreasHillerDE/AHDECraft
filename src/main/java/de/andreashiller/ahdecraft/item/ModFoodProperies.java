package de.andreashiller.ahdecraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperies {
    public static final FoodProperties BLUE_BERRY = new FoodProperties.Builder().nutrition(2)
            .saturationModifier(0.15f).fast().build();
}
