package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.datagen.ModDatapackEntries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AHDECraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_ITEMS_TAB = CREATIVE_MODE_TABS.register("ahdecraft_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.REDDIAMOND.get()))
                    .title(Component.translatable("creativetab.ahdecraft.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.PERIDOT.get());
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.REDDIAMOND.get());
                        output.accept(ModItems.REDDIAMONDINGOT.get());
                        output.accept(ModItems.REDDIAMONDNUGGET.get());
                        output.accept(ModItems.REDDIAMONDDUST.get());
                        output.accept(ModItems.REDCOAL.get());
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.RAW_ALU.get());
                        output.accept(ModItems.RAW_LEAD.get());
                        output.accept(ModItems.RAW_THUNGSTON.get());
                        output.accept(ModItems.SILICONE.get());
                        output.accept(ModItems.RAW_SILICIUM.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.ALU_INGOT.get());
                        output.accept(ModItems.LEAD_INGOT.get());
                        output.accept(ModItems.THUNGSTON_INGOT.get());
                        output.accept(ModItems.SILICIUM_INGOT.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_NATURE_TAB = CREATIVE_MODE_TABS.register("ahdecraft_nature_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.REDDIAMOND_SAPLING.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.nature"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // SAPLINGS
                        output.accept(ModBlocks.REDDIAMOND_SAPLING.get());
                        output.accept(ModBlocks.RUBBER_TREE_SAPLING.get());
                        // LEAVES
                        output.accept(ModBlocks.REDDIAMOND_LEAVES.get());
                        output.accept(ModBlocks.RUBBER_TREE_LEAVES.get());
                        // WOODTYPES
                        output.accept(ModBlocks.REDDIAMOND_LOG.get());
                        output.accept(ModBlocks.RUBBER_TREE_LOG.get());

                        output.accept(ModBlocks.REDDIAMOND_WOOD.get());
                        output.accept(ModBlocks.RUBBER_TREE_WOOD.get());

                        output.accept(ModBlocks.STRIPPED_REDDIAMOND_LOG.get());
                        output.accept(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get());

                        output.accept(ModBlocks.STRIPPED_REDDIAMOND_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get());

                        output.accept(ModBlocks.REDDIAMOND_PLANKS.get());
                        output.accept(ModBlocks.RUBBER_TREE_PLANKS.get());

                        output.accept(ModBlocks.BLUE_BERRY_BUSH.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_FOOD_TAB = CREATIVE_MODE_TABS.register("ahdecraft_food_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BLUE_BERRY.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.food"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLUE_BERRY.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_TOOLS_TAB = CREATIVE_MODE_TABS.register("ahdecraft_tools_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CONVERSION_WAND.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CONVERSION_BALL.get());
                        output.accept(ModItems.CONVERSION_WAND.get());
                        output.accept(ModItems.REDDIAMOND_PICKAXE.get());
                        output.accept(ModItems.REDDIAMOND_SHOVEL.get());
                        output.accept(ModItems.REDDIAMOND_AXE.get());
                        output.accept(ModItems.REDDIAMOND_HOE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_WEAPONS_TAB = CREATIVE_MODE_TABS.register("ahdecraft_weapons_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.REDDIAMOND_SWORD.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.weapons"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.REDDIAMOND_SWORD.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_ARMOR_TAB = CREATIVE_MODE_TABS.register("ahdecraft_armor_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.REDDIAMOND_CHESTPLATE.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.armor"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.REDDIAMOND_HELMET.get());
                        output.accept(ModItems.REDDIAMOND_CHESTPLATE.get());
                        output.accept(ModItems.REDDIAMOND_LEGGINGS.get());
                        output.accept(ModItems.REDDIAMOND_BOOTS.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_ORES_TAB = CREATIVE_MODE_TABS.register("ahdecraft_ores_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.REDDIAMOND_ORE.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.ores"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.PERIDOT_ORE.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.REDDIAMOND_ORE.get());
                        output.accept(ModBlocks.RED_COAL_ORE.get());
                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.ALU_ORE.get());
                        output.accept(ModBlocks.LEAD_ORE.get());
                        output.accept(ModBlocks.THUNGSTON_ORE.get());
                        output.accept(ModBlocks.SILICONE_ORE.get());
                        output.accept(ModBlocks.SILICIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_PERIDOT_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_REDDIAMOND_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RED_COAL_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ALU_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_LEAD_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_THUNGSTON_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILICONE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILICIUM_ORE.get());
                        output.accept(ModBlocks.NETHER_IRON_ORE.get());
                        output.accept(ModBlocks.NETHER_COPPER_ORE.get());
                        output.accept(ModBlocks.NETHER_COAL_ORE.get());
                        output.accept(ModBlocks.NETHER_LAPIS_LAZULI_ORE.get());
                        output.accept(ModBlocks.NETHER_REDSTONE_ORE.get());
                        output.accept(ModBlocks.NETHER_DIAMOND_ORE.get());
                        output.accept(ModBlocks.NETHER_EMERALD_ORE.get());
                        output.accept(ModBlocks.NETHER_RUBY_ORE.get());
                        output.accept(ModBlocks.NETHER_PERIDOT_ORE.get());
                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.NETHER_REDDIAMOND_ORE.get());
                        output.accept(ModBlocks.NETHER_RED_COAL_ORE.get());
                        output.accept(ModBlocks.NETHER_TIN_ORE.get());
                        output.accept(ModBlocks.NETHER_SILVER_ORE.get());
                        output.accept(ModBlocks.NETHER_ALU_ORE.get());
                        output.accept(ModBlocks.NETHER_LEAD_ORE.get());
                        output.accept(ModBlocks.NETHER_THUNGSTON_ORE.get());
                        output.accept(ModBlocks.NETHER_SILICONE_ORE.get());
                        output.accept(ModBlocks.NETHER_SILICIUM_ORE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_BLOCKS_TAB = CREATIVE_MODE_TABS.register("ahdecraft_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.REDDIAMOND_BLOCK.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.PERIDOT_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RED_COAL_BLOCK.get());
                        output.accept(ModBlocks.REDDIAMOND_BLOCK.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.SILVER_BLOCK.get());
                        output.accept(ModBlocks.ALU_BLOCK.get());
                        output.accept(ModBlocks.LEAD_BLOCK.get());
                        output.accept(ModBlocks.THUNGSTON_BLOCK.get());
                        output.accept(ModBlocks.SILICONE_BLOCK.get());
                        output.accept(ModBlocks.SILICIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALU_BLOCK.get());
                        output.accept(ModBlocks.RAW_LEAD_BLOCK.get());
                        output.accept(ModBlocks.RAW_THUNGSTON_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILICIUM_BLOCK.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
