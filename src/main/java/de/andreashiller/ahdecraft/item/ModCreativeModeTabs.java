package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
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

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_TOOLS_TAB = CREATIVE_MODE_TABS.register("ahdecraft_tools_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CONVERSION_WAND.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CONVERSION_BALL.get());
                        output.accept(ModItems.CONVERSION_WAND.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_WEAPONS_TAB = CREATIVE_MODE_TABS.register("ahdecraft_weapons_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.REDDIAMOND_ORE.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.weapons"))
                    .displayItems((itemDisplayParameters, output) -> {

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
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
