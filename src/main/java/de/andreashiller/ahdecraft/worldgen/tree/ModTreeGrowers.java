package de.andreashiller.ahdecraft.worldgen.tree;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {

    public static final TreeGrower REDDIAMOND = new TreeGrower(AHDECraft.MOD_ID + ":reddiamond",
            Optional.empty(), Optional.of(ModConfiguredFeatures.REDDIAMOND_KEY), Optional.empty());

    public static final TreeGrower RUBBER = new TreeGrower(AHDECraft.MOD_ID + ":rubber",
            Optional.empty(), Optional.of(ModConfiguredFeatures.RUBBER_KEY), Optional.empty());

}
