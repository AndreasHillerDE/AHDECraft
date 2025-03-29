package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier REDDIAMOND = new ForgeTier(3000, 8f, 3f, 20,
            ModTags.Blocks.NEEDS_REDDIAMOND_TOOL, () -> Ingredient.of(ModItems.REDDIAMOND.get()),
            ModTags.Blocks.INCORRECT_FOR_REDDIAMOND_TOOLS);
}
