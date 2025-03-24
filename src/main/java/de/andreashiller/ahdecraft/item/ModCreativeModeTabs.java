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
                    }).build());

    public static final RegistryObject<CreativeModeTab> AHDECRAFT_BLOCKS_TAB = CREATIVE_MODE_TABS.register("ahdecraft_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.REDDIAMOND_ORE.get()))
                    .withTabsBefore(AHDECRAFT_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.ahdecraft.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.PERIDOT_ORE.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.REDDIAMOND_ORE.get());
                        output.accept(ModBlocks.RED_COAL_ORE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
