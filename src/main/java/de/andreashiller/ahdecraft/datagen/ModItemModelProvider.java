package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AHDECraft.MOD_ID, existingFileHelper);

    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.CONVERSION_BALL.get());
        basicItem(ModItems.CONVERSION_WAND.get());
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.PERIDOT.get());
        basicItem(ModItems.SAPPHIRE.get());
        basicItem(ModItems.REDCOAL.get());
        basicItem(ModItems.REDDIAMOND.get());
        basicItem(ModItems.REDDIAMONDDUST.get());
        basicItem(ModItems.REDDIAMONDINGOT.get());
        basicItem(ModItems.REDDIAMONDNUGGET.get());
        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.RAW_ALU.get());
        basicItem(ModItems.RAW_LEAD.get());
        basicItem(ModItems.RAW_THUNGSTON.get());
        basicItem(ModItems.RAW_SILICIUM.get());
        basicItem(ModItems.SILICONE.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.ALU_INGOT.get());
        basicItem(ModItems.LEAD_INGOT.get());
        basicItem(ModItems.THUNGSTON_INGOT.get());
        basicItem(ModItems.SILICIUM_INGOT.get());
    }
}
