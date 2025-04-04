package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;

import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
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
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(ModBlocks.RAW_ALU_BLOCK.get());
        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_THUNGSTON_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILICIUM_BLOCK.get());
        dropSelf(ModBlocks.REDDIAMOND_LOG.get());
        dropSelf(ModBlocks.REDDIAMOND_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_REDDIAMOND_LOG.get());
        dropSelf(ModBlocks.STRIPPED_REDDIAMOND_WOOD.get());
        dropSelf(ModBlocks.REDDIAMOND_PLANKS.get());
        dropSelf(ModBlocks.REDDIAMOND_SAPLING.get());
        dropSelf(ModBlocks.RUBBER_TREE_LOG.get());
        dropSelf(ModBlocks.RUBBER_TREE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get());
        dropSelf(ModBlocks.RUBBER_TREE_PLANKS.get());
        dropSelf(ModBlocks.RUBBER_TREE_SAPLING.get());

        // One Drop per Stone Ore
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

        // One Drop per Deepslate Ore
        this.add(ModBlocks.DEEPSLATE_REDDIAMOND_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_REDDIAMOND_ORE.get(), ModItems.REDDIAMOND.get()));
        this.add(ModBlocks.DEEPSLATE_RED_COAL_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_RED_COAL_ORE.get(), ModItems.REDCOAL.get()));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.DEEPSLATE_ALU_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ALU_ORE.get(), ModItems.RAW_ALU.get()));
        this.add(ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.DEEPSLATE_THUNGSTON_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_THUNGSTON_ORE.get(), ModItems.RAW_THUNGSTON.get()));
        this.add(ModBlocks.DEEPSLATE_SILICIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SILICIUM_ORE.get(), ModItems.RAW_SILICIUM.get()));
        this.add(ModBlocks.DEEPSLATE_SILICONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_SILICONE_ORE.get(), ModItems.SILICONE.get(),1,4));
        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get(),1,3));
        this.add(ModBlocks.DEEPSLATE_PERIDOT_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_PERIDOT_ORE.get(), ModItems.PERIDOT.get(),1,3));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get(),1,3));

        // 2 or more Drop per Netherrack Ore
        this.add(ModBlocks.NETHER_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_IRON_ORE.get(), Items.RAW_IRON,2,2));
        this.add(ModBlocks.NETHER_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_COPPER_ORE.get(), Items.RAW_COPPER,4,8));
        this.add(ModBlocks.NETHER_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_COAL_ORE.get(), Items.COAL,2,2));
        this.add(ModBlocks.NETHER_LAPIS_LAZULI_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_LAPIS_LAZULI_ORE.get(), Items.LAPIS_LAZULI,5,10));
        this.add(ModBlocks.NETHER_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_REDSTONE_ORE.get(), Items.REDSTONE,5,10));
        this.add(ModBlocks.NETHER_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_DIAMOND_ORE.get(), Items.DIAMOND,2,2));
        this.add(ModBlocks.NETHER_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_EMERALD_ORE.get(), Items.EMERALD,2,2));
        this.add(ModBlocks.NETHER_REDDIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_REDDIAMOND_ORE.get(), ModItems.REDDIAMOND.get(),2,2));
        this.add(ModBlocks.NETHER_RED_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_RED_COAL_ORE.get(), ModItems.REDCOAL.get(), 2, 2));
        this.add(ModBlocks.NETHER_TIN_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_TIN_ORE.get(), ModItems.RAW_TIN.get(),2, 2));
        this.add(ModBlocks.NETHER_SILVER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_SILVER_ORE.get(), ModItems.RAW_SILVER.get(), 2, 2));
        this.add(ModBlocks.NETHER_ALU_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_ALU_ORE.get(), ModItems.RAW_ALU.get(),2,2));
        this.add(ModBlocks.NETHER_LEAD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_LEAD_ORE.get(), ModItems.RAW_LEAD.get(),2, 2));
        this.add(ModBlocks.NETHER_THUNGSTON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_THUNGSTON_ORE.get(), ModItems.RAW_THUNGSTON.get(),2, 2));
        this.add(ModBlocks.NETHER_SILICIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_SILICIUM_ORE.get(), ModItems.RAW_SILICIUM.get(), 2, 2));
        this.add(ModBlocks.NETHER_SILICONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_SILICONE_ORE.get(), ModItems.SILICONE.get(),4,8));
        this.add(ModBlocks.NETHER_RUBY_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_RUBY_ORE.get(), ModItems.RUBY.get(),3,6));
        this.add(ModBlocks.NETHER_PERIDOT_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_PERIDOT_ORE.get(), ModItems.PERIDOT.get(),3,6));
        this.add(ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get(),3,6));

        // LEAVES
        this.add(ModBlocks.REDDIAMOND_LEAVES.get(),
                block -> createLeavesDrops(block, ModBlocks.REDDIAMOND_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.RUBBER_TREE_LEAVES.get(),
                block -> createLeavesDrops(block, ModBlocks.RUBBER_TREE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        // BUSHES AND BERRIES
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        this.add(ModBlocks.BLUE_BERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BLUE_BERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(ModItems.BLUE_BERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BLUE_BERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(ModItems.BLUE_BERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));

        this.add(ModBlocks.RASPBERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.RASPBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(ModItems.RASPBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.RASPBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(ModItems.RASPBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));

        this.add(ModBlocks.BLACKBERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BLACKBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(ModItems.BLACKBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BLACKBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(ModItems.BLACKBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));

        
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
