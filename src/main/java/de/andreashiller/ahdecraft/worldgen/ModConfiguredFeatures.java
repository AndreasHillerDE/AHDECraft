package de.andreashiller.ahdecraft.worldgen;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PERIDOT_ORE_KEY = registerKey("peridot_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_COAL_ORE_KEY = registerKey("red_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_REDDIAMOND_ORE_KEY = registerKey("reddiamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALU_ORE_KEY = registerKey("alu_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_THUNGSTON_ORE_KEY = registerKey("thungston_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILICONE_ORE_KEY = registerKey("silicone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILICIUM_ORE_KEY = registerKey("silicium_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldRubyOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.RUBY_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldPeridotOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.PERIDOT_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.PERIDOT_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldSapphireOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldRedCoalOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.RED_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.RED_COAL_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldRedDiamondOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.REDDIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.REDDIAMOND_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldTinOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldSilverOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.SILVER_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldAluOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.ALU_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ALU_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldLeadOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.LEAD_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldThungstonOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.THUNGSTON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.THUNGSTON_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldSiliconeOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILICONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.SILICONE_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldSiliciumOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILICIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.SILICONE_ORE.get().defaultBlockState())
        );

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOre, 3));
        register(context, OVERWORLD_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPeridotOre, 3));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOre, 3));
        register(context, OVERWORLD_RED_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRedCoalOre, 12));
        register(context, OVERWORLD_REDDIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRedDiamondOre, 4));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOre, 6));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOre, 6));
        register(context, OVERWORLD_ALU_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluOre, 6));
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOre, 6));
        register(context, OVERWORLD_THUNGSTON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldThungstonOre, 6));
        register(context, OVERWORLD_SILICONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSiliconeOre, 6));
        register(context, OVERWORLD_SILICIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSiliciumOre, 6));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AHDECraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
