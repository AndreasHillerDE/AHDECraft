package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AHDECraft.MOD_ID);

    public static final RegistryObject<Item> CONVERSION_BALL = ITEMS.register("conversion_ball",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONVERSION_WAND = ITEMS.register("conversion_wand",
            () -> new Item(new Item.Properties()));
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
            () -> new FuelItem(new Item.Properties(),3200));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALU = ITEMS.register("raw_alu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_THUNGSTON = ITEMS.register("raw_thungston",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICONE = ITEMS.register("silicone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILICIUM = ITEMS.register("raw_silicium",
            () -> new Item(new Item.Properties()));

    // INGOTS
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALU_INGOT = ITEMS.register("alu_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THUNGSTON_INGOT = ITEMS.register("thungston_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICIUM_INGOT = ITEMS.register("silicium_ingot",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
