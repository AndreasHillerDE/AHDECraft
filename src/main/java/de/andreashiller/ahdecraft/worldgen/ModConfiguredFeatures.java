package de.andreashiller.ahdecraft.worldgen;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
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

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PERIDOT_ORE_KEY = registerKey("nether_peridot_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RED_COAL_ORE_KEY = registerKey("nether_red_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDDIAMOND_ORE_KEY = registerKey("nether_reddiamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TIN_ORE_KEY = registerKey("nether_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ALU_ORE_KEY = registerKey("nether_alu_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LEAD_ORE_KEY = registerKey("nether_lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_THUNGSTON_ORE_KEY = registerKey("nether_thungston_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILICONE_ORE_KEY = registerKey("nether_silicone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILICIUM_ORE_KEY = registerKey("nether_silicium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE_KEY = registerKey("nether_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORE_KEY = registerKey("nether_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE_KEY = registerKey("nether_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_LAZULI_ORE_KEY = registerKey("nether_lapis_lazuli_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE_KEY = registerKey("nether_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORE_KEY = registerKey("nether_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORE_KEY = registerKey("nether_emerald_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> REDDIAMOND_KEY = registerKey("reddiamond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBBER_KEY = registerKey("rubber");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldRubyOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldPeridotOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.PERIDOT_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_PERIDOT_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldSapphireOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldRedCoalOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.RED_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RED_COAL_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldRedDiamondOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.REDDIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_REDDIAMOND_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldTinOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldSilverOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldAluOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.ALU_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ALU_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldLeadOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldThungstonOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.THUNGSTON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_THUNGSTON_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldSiliconeOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILICONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SILICONE_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldSiliciumOre = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILICIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SILICONE_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> netherReddiamondOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_REDDIAMOND_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherRedCoalOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_RED_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherRubyOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_RUBY_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherPeridotOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_PERIDOT_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherSapphireOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherTinOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_TIN_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherSilverOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherAluOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_ALU_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherLeadOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_LEAD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherThungstonOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_THUNGSTON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherSiliconeOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_SILICONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherSiliciumOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_SILICIUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherIronOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherCopperOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherCoalOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherLapisLazuliOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_LAPIS_LAZULI_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherRedstoneOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherDiamondOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherEmeraldOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_EMERALD_ORE.get().defaultBlockState()));

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

        register(context, NETHER_REDDIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(netherReddiamondOre, 3));
        register(context, NETHER_RED_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherRedCoalOre, 12));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherRubyOre, 3));
        register(context, NETHER_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(netherPeridotOre, 3));
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherSapphireOre, 3));
        register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherTinOre, 6));
        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherSilverOre, 6));
        register(context, NETHER_ALU_ORE_KEY, Feature.ORE, new OreConfiguration(netherAluOre, 6));
        register(context, NETHER_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherLeadOre, 6));
        register(context, NETHER_THUNGSTON_ORE_KEY, Feature.ORE, new OreConfiguration(netherThungstonOre, 6));
        register(context, NETHER_SILICONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherSiliconeOre, 6));
        register(context, NETHER_SILICIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherSiliciumOre, 6));

        register(context, NETHER_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(netherIronOre, 12));
        register(context, NETHER_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(netherCopperOre, 12));
        register(context, NETHER_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherCoalOre, 12));
        register(context, NETHER_LAPIS_LAZULI_ORE_KEY, Feature.ORE, new OreConfiguration(netherLapisLazuliOre, 6));
        register(context, NETHER_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherRedstoneOre, 6));
        register(context, NETHER_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(netherDiamondOre, 2));
        register(context, NETHER_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(netherEmeraldOre, 2));

        // REDIAMOND TREE
        register(context, REDDIAMOND_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.REDDIAMOND_LOG.get()),
                new StraightTrunkPlacer(4, 2, 3),

                BlockStateProvider.simple(ModBlocks.REDDIAMOND_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(1), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        // RUBBER TREE
        register(context, RUBBER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RUBBER_TREE_LOG.get()),
                new StraightTrunkPlacer(4, 4, 3),

                BlockStateProvider.simple(ModBlocks.RUBBER_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(1), 3),

                new TwoLayersFeatureSize(2, 0, 2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AHDECraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
