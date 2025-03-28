package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.RegisterRecipeBookCategoriesEvent;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

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


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
