package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AHDECraft.MOD_ID, existingFileHelper);

    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.REDDIAMOND_BLOCK.get())
                .add(ModBlocks.RED_COAL_BLOCK.get())
                .add(ModBlocks.REDDIAMOND_ORE.get())
                .add(ModBlocks.RED_COAL_ORE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.PERIDOT_ORE.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.ALU_ORE.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.THUNGSTON_ORE.get())
                .add(ModBlocks.SILICONE_ORE.get())
                .add(ModBlocks.SILICIUM_ORE.get())
                .add(ModBlocks.NETHER_IRON_ORE.get())
                .add(ModBlocks.NETHER_COPPER_ORE.get())
                .add(ModBlocks.NETHER_COAL_ORE.get())
                .add(ModBlocks.NETHER_LAPIS_LAZULI_ORE.get())
                .add(ModBlocks.NETHER_REDSTONE_ORE.get())
                .add(ModBlocks.NETHER_DIAMOND_ORE.get())
                .add(ModBlocks.NETHER_EMERALD_ORE.get())
                .add(ModBlocks.NETHER_REDDIAMOND_ORE.get())
                .add(ModBlocks.NETHER_RED_COAL_ORE.get())
                .add(ModBlocks.NETHER_RUBY_ORE.get())
                .add(ModBlocks.NETHER_PERIDOT_ORE.get())
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.NETHER_TIN_ORE.get())
                .add(ModBlocks.NETHER_SILVER_ORE.get())
                .add(ModBlocks.NETHER_ALU_ORE.get())
                .add(ModBlocks.NETHER_LEAD_ORE.get())
                .add(ModBlocks.NETHER_THUNGSTON_ORE.get())
                .add(ModBlocks.NETHER_SILICONE_ORE.get())
                .add(ModBlocks.NETHER_SILICIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_REDDIAMOND_ORE.get())
                .add(ModBlocks.DEEPSLATE_RED_COAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_PERIDOT_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_ALU_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_THUNGSTON_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILICONE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILICIUM_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.PERIDOT_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.ALU_BLOCK.get())
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.THUNGSTON_BLOCK.get())
                .add(ModBlocks.SILICONE_BLOCK.get())
                .add(ModBlocks.SILICIUM_BLOCK.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.RAW_ALU_BLOCK.get())
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.RAW_THUNGSTON_BLOCK.get())
                .add(ModBlocks.RAW_SILICIUM_BLOCK.get());


        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RED_COAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_RED_COAL_ORE.get())
                .add(ModBlocks.RED_COAL_BLOCK.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.ALU_ORE.get())
                .add(ModBlocks.SILICONE_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_ALU_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILICONE_ORE.get())
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.ALU_BLOCK.get())
                .add(ModBlocks.SILICONE_BLOCK.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.RAW_ALU_BLOCK.get());


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.REDDIAMOND_BLOCK.get())
                .add(ModBlocks.REDDIAMOND_ORE.get())
                .add(ModBlocks.DEEPSLATE_REDDIAMOND_ORE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.PERIDOT_ORE.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.THUNGSTON_ORE.get())
                .add(ModBlocks.SILICIUM_ORE.get())
                .add(ModBlocks.NETHER_IRON_ORE.get())
                .add(ModBlocks.NETHER_COPPER_ORE.get())
                .add(ModBlocks.NETHER_COAL_ORE.get())
                .add(ModBlocks.NETHER_LAPIS_LAZULI_ORE.get())
                .add(ModBlocks.NETHER_REDSTONE_ORE.get())
                .add(ModBlocks.NETHER_DIAMOND_ORE.get())
                .add(ModBlocks.NETHER_EMERALD_ORE.get())
                .add(ModBlocks.NETHER_REDDIAMOND_ORE.get())
                .add(ModBlocks.NETHER_RED_COAL_ORE.get())
                .add(ModBlocks.NETHER_RUBY_ORE.get())
                .add(ModBlocks.NETHER_PERIDOT_ORE.get())
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.NETHER_TIN_ORE.get())
                .add(ModBlocks.NETHER_SILVER_ORE.get())
                .add(ModBlocks.NETHER_ALU_ORE.get())
                .add(ModBlocks.NETHER_LEAD_ORE.get())
                .add(ModBlocks.NETHER_THUNGSTON_ORE.get())
                .add(ModBlocks.NETHER_SILICONE_ORE.get())
                .add(ModBlocks.NETHER_SILICIUM_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.PERIDOT_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.THUNGSTON_BLOCK.get())
                .add(ModBlocks.SILICIUM_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.RAW_THUNGSTON_BLOCK.get())
                .add(ModBlocks.RAW_SILICIUM_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_REDDIAMOND_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_PERIDOT_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_THUNGSTON_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILICIUM_ORE.get());

        tag(ModTags.Blocks.NEEDS_REDDIAMOND_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_REDDIAMOND_TOOLS)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_REDDIAMOND_TOOL);

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.REDDIAMOND_LOG.get())
                .add(ModBlocks.REDDIAMOND_WOOD.get())
                .add(ModBlocks.STRIPPED_REDDIAMOND_LOG.get())
                .add(ModBlocks.STRIPPED_REDDIAMOND_WOOD.get())
                .add(ModBlocks.RUBBER_TREE_LOG.get())
                .add(ModBlocks.RUBBER_TREE_WOOD.get())
                .add(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get());
    }
}
