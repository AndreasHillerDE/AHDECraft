package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        List<ItemLike> REDDIAMOND_SMELTABLES = List.of(ModItems.REDDIAMOND.get());

        // SHAPED RECIPES
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONVERSION_BALL.get())
                .pattern("RRR")
                .pattern("RDR")
                .pattern("RRR")
                .define('R', ModItems.REDDIAMOND.get())
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.CONVERSION_BALL.get()),has(ModItems.CONVERSION_BALL.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONVERSION_WAND.get())
                .pattern("  C")
                .pattern(" S ")
                .pattern("S  ")
                .define('C', ModItems.CONVERSION_BALL.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CONVERSION_WAND.get()),has(ModItems.CONVERSION_WAND.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REDDIAMOND_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.REDDIAMOND.get())
                .unlockedBy(getHasName(ModItems.REDDIAMOND.get()),has(ModItems.REDDIAMOND.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_COAL_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.REDCOAL.get())
                .unlockedBy(getHasName(ModItems.REDCOAL.get()),has(ModItems.REDCOAL.get())).save(pRecipeOutput);

        // SHAPLESS RECIPES
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REDDIAMOND.get(), 9)
                .requires(ModBlocks.REDDIAMOND_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.REDDIAMOND_BLOCK.get()), has(ModBlocks.REDDIAMOND_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.REDCOAL.get(), 9)
                .requires(ModBlocks.RED_COAL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RED_COAL_BLOCK.get()), has(ModBlocks.RED_COAL_BLOCK.get())).save(pRecipeOutput);

        // SMELTING
        oreSmelting(pRecipeOutput, REDDIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.REDDIAMONDINGOT.get(), 0.25f, 200, "reddiamond");

        // BLASTING
        oreBlasting(pRecipeOutput, REDDIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.REDDIAMONDINGOT.get(), 0.25f, 100, "reddiamond");
    }
}
