package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;

import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;


import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {

        // Drops themself
        dropSelf(ModBlocks.REDDIAMOND_BLOCK.get());
        dropSelf(ModBlocks.RED_COAL_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.PERIDOT_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.SILVER_BLOCK.get());
        dropSelf(ModBlocks.ALU_BLOCK.get());
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.THUNGSTON_BLOCK.get());
        dropSelf(ModBlocks.SILICONE_BLOCK.get());
        dropSelf(ModBlocks.SILICIUM_BLOCK.get());

        // One Drop per Ore
        this.add(ModBlocks.REDDIAMOND_ORE.get(),
                block -> createOreDrop(ModBlocks.REDDIAMOND_ORE.get(), ModItems.REDDIAMOND.get()));
        this.add(ModBlocks.RED_COAL_ORE.get(),
                block -> createOreDrop(ModBlocks.RED_COAL_ORE.get(), ModItems.REDCOAL.get()));
        this.add(ModBlocks.TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.ALU_ORE.get(),
                block -> createOreDrop(ModBlocks.ALU_ORE.get(), ModItems.RAW_ALU.get()));
        this.add(ModBlocks.LEAD_ORE.get(),
                block -> createOreDrop(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.THUNGSTON_ORE.get(),
                block -> createOreDrop(ModBlocks.THUNGSTON_ORE.get(), ModItems.RAW_THUNGSTON.get()));
        this.add(ModBlocks.SILICIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.SILICIUM_ORE.get(), ModItems.RAW_SILICIUM.get()));

        this.add(ModBlocks.SILICONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SILICONE_ORE.get(), ModItems.SILICONE.get(),1,4));
        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get(),1,3));
        this.add(ModBlocks.PERIDOT_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PERIDOT_ORE.get(), ModItems.PERIDOT.get(),1,3));
        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get(),1,3));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock,
                (LootPoolEntryContainer.Builder<?>)this.applyExplosionDecay(
                        pBlock,
                        LootItem.lootTableItem(item)// Builder<capture of?>
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
