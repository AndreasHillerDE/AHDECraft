package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.block.custom.BlueBerryBushBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.event.RegisterRecipeBookCategoriesEvent;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AHDECraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RED_COAL_BLOCK);
        blockWithItem(ModBlocks.REDDIAMOND_BLOCK);
        blockWithItem(ModBlocks.RED_COAL_ORE);
        blockWithItem(ModBlocks.REDDIAMOND_ORE);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.PERIDOT_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.ALU_ORE);
        blockWithItem(ModBlocks.LEAD_ORE);
        blockWithItem(ModBlocks.THUNGSTON_ORE);
        blockWithItem(ModBlocks.SILICONE_ORE);
        blockWithItem(ModBlocks.SILICIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RED_COAL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_REDDIAMOND_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PERIDOT_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ALU_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_LEAD_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_THUNGSTON_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILICONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILICIUM_ORE);
        blockWithItem(ModBlocks.NETHER_IRON_ORE);
        blockWithItem(ModBlocks.NETHER_COPPER_ORE);
        blockWithItem(ModBlocks.NETHER_COAL_ORE);
        blockWithItem(ModBlocks.NETHER_REDSTONE_ORE);
        blockWithItem(ModBlocks.NETHER_LAPIS_LAZULI_ORE);
        blockWithItem(ModBlocks.NETHER_DIAMOND_ORE);
        blockWithItem(ModBlocks.NETHER_EMERALD_ORE);
        blockWithItem(ModBlocks.NETHER_RED_COAL_ORE);
        blockWithItem(ModBlocks.NETHER_REDDIAMOND_ORE);
        blockWithItem(ModBlocks.NETHER_RUBY_ORE);
        blockWithItem(ModBlocks.NETHER_PERIDOT_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_TIN_ORE);
        blockWithItem(ModBlocks.NETHER_SILVER_ORE);
        blockWithItem(ModBlocks.NETHER_ALU_ORE);
        blockWithItem(ModBlocks.NETHER_LEAD_ORE);
        blockWithItem(ModBlocks.NETHER_THUNGSTON_ORE);
        blockWithItem(ModBlocks.NETHER_SILICONE_ORE);
        blockWithItem(ModBlocks.NETHER_SILICIUM_ORE);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.PERIDOT_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.ALU_BLOCK);
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.THUNGSTON_BLOCK);
        blockWithItem(ModBlocks.SILICONE_BLOCK);
        blockWithItem(ModBlocks.SILICIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_ALU_BLOCK);
        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.RAW_THUNGSTON_BLOCK);
        blockWithItem(ModBlocks.RAW_SILICIUM_BLOCK);

        // REDDIAMOND TREE
        logBlock(ModBlocks.REDDIAMOND_LOG.get());
        axisBlock(ModBlocks.REDDIAMOND_WOOD.get(), blockTexture(ModBlocks.REDDIAMOND_LOG.get()), blockTexture(ModBlocks.REDDIAMOND_LOG.get()));
        logBlock(ModBlocks.STRIPPED_REDDIAMOND_LOG.get());
        axisBlock(ModBlocks.STRIPPED_REDDIAMOND_WOOD.get(), blockTexture(ModBlocks.STRIPPED_REDDIAMOND_LOG.get()), blockTexture(ModBlocks.STRIPPED_REDDIAMOND_LOG.get()));

        // RUBBER TREE
        logBlock(ModBlocks.RUBBER_TREE_LOG.get());
        axisBlock(ModBlocks.RUBBER_TREE_WOOD.get(), blockTexture(ModBlocks.RUBBER_TREE_LOG.get()), blockTexture(ModBlocks.RUBBER_TREE_LOG.get()));
        logBlock(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get());
        axisBlock(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get(), blockTexture(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get()), blockTexture(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get()));


        // RED DIAMOND TREE
        blockItem(ModBlocks.REDDIAMOND_LOG);
        blockItem(ModBlocks.REDDIAMOND_WOOD);
        blockItem(ModBlocks.STRIPPED_REDDIAMOND_LOG);
        blockItem(ModBlocks.STRIPPED_REDDIAMOND_WOOD);
        blockWithItem(ModBlocks.REDDIAMOND_PLANKS);
        leavesBlock(ModBlocks.REDDIAMOND_LEAVES);
        saplingBlock(ModBlocks.REDDIAMOND_SAPLING);

        // RUBBER TREE
        blockItem(ModBlocks.RUBBER_TREE_LOG);
        blockItem(ModBlocks.RUBBER_TREE_WOOD);
        blockItem(ModBlocks.STRIPPED_RUBBER_TREE_LOG);
        blockItem(ModBlocks.STRIPPED_RUBBER_TREE_WOOD);
        blockWithItem(ModBlocks.RUBBER_TREE_PLANKS);
        leavesBlock(ModBlocks.RUBBER_TREE_LEAVES);
        saplingBlock(ModBlocks.RUBBER_TREE_SAPLING);

        // FOOD
        makeBush(((SweetBerryBushBlock) ModBlocks.BLUE_BERRY_BUSH.get()), "blue_berry_bush_stage", "blue_berry_bush_stage");
        makeBush(((SweetBerryBushBlock) ModBlocks.RASPBERRY_BUSH.get()), "raspberry_bush_stage", "raspberry_bush_stage");
        makeBush(((SweetBerryBushBlock) ModBlocks.BLACKBERRY_BUSH.get()), "blackberry_bush_stage", "blackberry_bush_stage");

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("ahdecraft:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("ahdecraft:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void makeBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(BlueBerryBushBlock.AGE),
                ResourceLocation.fromNamespaceAndPath(AHDECraft.MOD_ID, "block/" + textureName + state.getValue(BlueBerryBushBlock.AGE))).renderType("cutout"));

        return models;
    }
}
