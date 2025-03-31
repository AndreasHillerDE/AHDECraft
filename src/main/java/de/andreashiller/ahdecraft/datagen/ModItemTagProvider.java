package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, AHDECraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.REDDIAMOND_HELMET.get())
                .add(ModItems.REDDIAMOND_CHESTPLATE.get())
                .add(ModItems.REDDIAMOND_LEGGINGS.get())
                .add(ModItems.REDDIAMOND_BOOTS.get());

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.REDDIAMOND_LOG.get().asItem())
                .add(ModBlocks.REDDIAMOND_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_REDDIAMOND_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_REDDIAMOND_WOOD.get().asItem())
                .add(ModBlocks.RUBBER_TREE_LOG.get().asItem())
                .add(ModBlocks.RUBBER_TREE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get().asItem());

        tag(ItemTags.PLANKS)
                .add(ModBlocks.REDDIAMOND_PLANKS.get().asItem())
                .add(ModBlocks.RUBBER_TREE_PLANKS.get().asItem());
    }
}

