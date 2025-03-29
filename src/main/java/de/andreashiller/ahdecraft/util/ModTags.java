package de.andreashiller.ahdecraft.util;

import de.andreashiller.ahdecraft.AHDECraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_REDDIAMOND_TOOL = createTag("needs_reddiamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_REDDIAMOND_TOOLS = createTag("incorrect_for_reddiamond_tool");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(AHDECraft.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AHDECraft.MOD_ID, name));
        }
    }
}
