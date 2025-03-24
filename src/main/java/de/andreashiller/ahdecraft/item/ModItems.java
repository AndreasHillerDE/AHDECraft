package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.AHDECraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AHDECraft.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDDIAMOND = ITEMS.register("reddiamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDDIAMONDINGOT = ITEMS.register("reddiamond_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDDIAMONDNUGGET = ITEMS.register("reddiamond_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDDIAMONDDUST = ITEMS.register("reddiamond_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDCOAL = ITEMS.register("red_coal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
