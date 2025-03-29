package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.AHDECraft;
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
    }
}

