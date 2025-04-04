package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        List<ItemLike> REDDIAMOND_SMELTABLES = List.of(ModItems.REDDIAMOND.get());
        List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(), ModBlocks.TIN_ORE.get());
        List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER.get(), ModBlocks.SILVER_ORE.get());
        List<ItemLike> ALU_SMELTABLES = List.of(ModItems.RAW_ALU.get(), ModBlocks.ALU_ORE.get());
        List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD.get(), ModBlocks.LEAD_ORE.get());
        List<ItemLike> THUNGSTON_SMELTABLES = List.of(ModItems.RAW_THUNGSTON.get(), ModBlocks.THUNGSTON_ORE.get());
        List<ItemLike> SILICIUM_SMELTABLES = List.of(ModItems.RAW_SILICIUM.get(), ModBlocks.SILICIUM_ORE.get());

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REDDIAMOND_WOOD.get(), 3)
                .pattern("RR")
                .pattern("RR")
                .define('R', ModBlocks.REDDIAMOND_LOG.get())
                .unlockedBy(getHasName(ModBlocks.REDDIAMOND_WOOD.get()),has(ModBlocks.REDDIAMOND_WOOD.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBBER_TREE_WOOD.get(), 3)
                .pattern("RR")
                .pattern("RR")
                .define('R', ModBlocks.RUBBER_TREE_LOG.get())
                .unlockedBy(getHasName(ModBlocks.RUBBER_TREE_WOOD.get()),has(ModBlocks.RUBBER_TREE_WOOD.get())).save(pRecipeOutput);

        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get(), 1, ModItems.RUBY.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.PERIDOT_BLOCK.get(), 1, ModItems.PERIDOT.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get(), 1, ModItems.SAPPHIRE.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.REDDIAMOND_BLOCK.get(),1, ModItems.REDDIAMOND.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.RED_COAL_BLOCK.get(), 1, ModItems.REDCOAL.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get(), 1, ModItems.TIN_INGOT.get(),pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get(),1, ModItems.SILVER_INGOT.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.ALU_BLOCK.get(), 1, ModItems.ALU_INGOT.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get(), 1, ModItems.LEAD_INGOT.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.THUNGSTON_BLOCK.get(), 1, ModItems.THUNGSTON_INGOT.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.SILICONE_BLOCK.get(), 1, ModItems.SILICONE.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.SILICIUM_BLOCK.get(), 1, ModItems.SILICIUM_INGOT.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get(), 1, ModItems.RAW_TIN.get(),pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get(),1, ModItems.RAW_SILVER.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.RAW_ALU_BLOCK.get(), 1, ModItems.RAW_ALU.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.RAW_LEAD_BLOCK.get(), 1, ModItems.RAW_LEAD.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.RAW_THUNGSTON_BLOCK.get(), 1, ModItems.RAW_THUNGSTON.get(), pRecipeOutput);
        createDefaultBlockRecipe(RecipeCategory.MISC, ModBlocks.RAW_SILICIUM_BLOCK.get(), 1, ModItems.RAW_SILICIUM.get(), pRecipeOutput);

        // SHAPLESS RECIPES
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.RUBY.get(), ModBlocks.RUBY_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.PERIDOT.get(), ModBlocks.PERIDOT_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), ModBlocks.SAPPHIRE_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.REDDIAMOND.get(), ModBlocks.REDDIAMOND_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.REDCOAL.get(), ModBlocks.RED_COAL_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), ModBlocks.TIN_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), ModBlocks.SILICIUM_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.ALU_INGOT.get(), ModBlocks.ALU_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), ModBlocks.LEAD_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.THUNGSTON_INGOT.get(), ModBlocks.THUNGSTON_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.SILICONE.get(), ModBlocks.SILICONE_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.SILICIUM_INGOT.get(), ModBlocks.SILICIUM_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.RAW_TIN.get(), ModBlocks.RAW_TIN_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.RAW_SILVER.get(), ModBlocks.RAW_SILVER_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.RAW_ALU.get(), ModBlocks.RAW_ALU_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.RAW_LEAD.get(), ModBlocks.RAW_LEAD_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.RAW_THUNGSTON.get(), ModBlocks.RAW_THUNGSTON_BLOCK.get(), 9, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModItems.RAW_SILICIUM.get(), ModBlocks.RAW_SILICIUM_BLOCK.get(), 9, pRecipeOutput);

        createDefaultShapelessRecipe(RecipeCategory.MISC, ModBlocks.REDDIAMOND_PLANKS.get(), ModBlocks.REDDIAMOND_LOG.get(), 4, pRecipeOutput);
        createDefaultShapelessRecipe(RecipeCategory.MISC, ModBlocks.RUBBER_TREE_PLANKS.get(), ModBlocks.RUBBER_TREE_LOG.get(), 4, pRecipeOutput);

        // SMELTING
        oreSmelting(pRecipeOutput, REDDIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.REDDIAMONDINGOT.get(), 0.25f, 200, "reddiamond");
        oreSmelting(pRecipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 200, "tin_ingot");
        oreSmelting(pRecipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 200, "silver_ingot");
        oreSmelting(pRecipeOutput, ALU_SMELTABLES, RecipeCategory.MISC, ModItems.ALU_INGOT.get(), 0.25f, 200, "alu_ingot");
        oreSmelting(pRecipeOutput, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 200, "lead_ingot");
        oreSmelting(pRecipeOutput, THUNGSTON_SMELTABLES, RecipeCategory.MISC, ModItems.THUNGSTON_INGOT.get(), 0.25f, 200, "thungston_ingot");
        oreSmelting(pRecipeOutput, SILICIUM_SMELTABLES, RecipeCategory.MISC, ModItems.SILICIUM_INGOT.get(), 0.25f, 200, "silicium_ingot");

        // BLASTING
        oreBlasting(pRecipeOutput, REDDIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.REDDIAMONDINGOT.get(), 0.25f, 100, "reddiamond");
        oreBlasting(pRecipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 100, "tin_ingot");
        oreBlasting(pRecipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 100, "silver_ingot");
        oreBlasting(pRecipeOutput, ALU_SMELTABLES, RecipeCategory.MISC, ModItems.ALU_INGOT.get(), 0.25f, 100, "alu_ingot");
        oreBlasting(pRecipeOutput, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 100, "lead_ingot");
        oreBlasting(pRecipeOutput, THUNGSTON_SMELTABLES, RecipeCategory.MISC, ModItems.THUNGSTON_INGOT.get(), 0.25f, 100, "thungston_ingot");
        oreBlasting(pRecipeOutput, SILICIUM_SMELTABLES, RecipeCategory.MISC, ModItems.SILICIUM_INGOT.get(), 0.25f, 100, "silicium_ingot");

        // Stone Cutter
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.MISC, ModItems.REDDIAMOND.get(),ModBlocks.REDDIAMOND_ORE.get(),1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.MISC, ModItems.REDCOAL.get(), ModBlocks.RED_COAL_ORE.get(),1);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.MISC, ModItems.RUBY.get(), ModBlocks.RUBY_ORE.get(),3);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.MISC, ModItems.PERIDOT.get(), ModBlocks.PERIDOT_ORE.get(),3);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), ModBlocks.SAPPHIRE_ORE.get(),3);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.MISC, ModItems.SILICONE.get(), ModBlocks.SILICONE_ORE.get(),4);
        stonecutterResultFromBase(pRecipeOutput, RecipeCategory.MISC, ModItems.REDDIAMONDDUST.get(), ModBlocks.REDDIAMOND_LEAVES.get(), 4);

        // Toolsets
        createSwordRecipe(RecipeCategory.MISC, ModItems.REDDIAMOND_SWORD.get(), ModItems.REDDIAMONDINGOT.get(), pRecipeOutput);
        createPickaxeRecipe(RecipeCategory.MISC, ModItems.REDDIAMOND_PICKAXE.get(), ModItems.REDDIAMONDINGOT.get(), pRecipeOutput);
        createShovelRecipe(RecipeCategory.MISC, ModItems.REDDIAMOND_SHOVEL.get(), ModItems.REDDIAMONDINGOT.get(), pRecipeOutput);
        createAxeRecipe(RecipeCategory.MISC, ModItems.REDDIAMOND_AXE.get(), ModItems.REDDIAMONDINGOT.get(), pRecipeOutput);
        createHoeRecipe(RecipeCategory.MISC, ModItems.REDDIAMOND_HOE.get(), ModItems.REDDIAMONDINGOT.get(), pRecipeOutput);

    }

    public static void createDefaultBlockRecipe(RecipeCategory category, @NotNull ItemLike output, int count, @NotNull ItemLike input, RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, count)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', input)
                .unlockedBy(getHasName(input),has(input)).save(pRecipeOutput);
    }

    public static void createDefaultShapelessRecipe(RecipeCategory category, @NotNull ItemLike output, @NotNull ItemLike input, int count, RecipeOutput pRecipeOutput) {
        ShapelessRecipeBuilder.shapeless(category, output, count)
                .requires(input)
                .unlockedBy(getHasName(input), has(input)).save(pRecipeOutput);
    }

    public static void createSwordRecipe(RecipeCategory category, @NotNull ItemLike output, @NotNull ItemLike input, RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, 1)
                .pattern("X")
                .pattern("X")
                .pattern("S")
                .define('X', input)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(input),has(input)).save(pRecipeOutput);
    }

    public static void createPickaxeRecipe(RecipeCategory category, @NotNull ItemLike output, @NotNull ItemLike input, RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, 1)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .define('X', input)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(input),has(input)).save(pRecipeOutput);
    }

    public static void createShovelRecipe(RecipeCategory category, @NotNull ItemLike output, @NotNull ItemLike input, RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, 1)
                .pattern("X")
                .pattern("S")
                .pattern("S")
                .define('X', input)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(input),has(input)).save(pRecipeOutput);
    }

    public static void createAxeRecipe(RecipeCategory category, @NotNull ItemLike output, @NotNull ItemLike input, RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, 1)
                .pattern("XX")
                .pattern("XS")
                .pattern(" S")
                .define('X', input)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(input),has(input)).save(pRecipeOutput);
    }

    public static void createHoeRecipe(RecipeCategory category, @NotNull ItemLike output, @NotNull ItemLike input, RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, 1)
                .pattern("XX")
                .pattern(" S")
                .pattern(" S")
                .define('X', input)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(input),has(input)).save(pRecipeOutput);
    }

}
