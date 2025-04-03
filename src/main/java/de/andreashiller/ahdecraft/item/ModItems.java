package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.custom.FuelItem;

import net.minecraft.world.item.*;
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

    // TOOLS
    public static final RegistryObject<Item> REDDIAMOND_SWORD = ITEMS.register("reddiamond_sword",
            () -> new SwordItem(ModToolTiers.REDDIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.REDDIAMOND, 3, -2.4f))));

    public static final RegistryObject<Item> REDDIAMOND_PICKAXE = ITEMS.register("reddiamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REDDIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.REDDIAMOND, 1, -2.8f))));

    public static final RegistryObject<Item> REDDIAMOND_SHOVEL = ITEMS.register("reddiamond_shovel",
            () -> new ShovelItem(ModToolTiers.REDDIAMOND, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.REDDIAMOND, 1.5f, -3.0f))));

    public static final RegistryObject<Item> REDDIAMOND_AXE = ITEMS.register("reddiamond_axe",
            () -> new AxeItem(ModToolTiers.REDDIAMOND, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.REDDIAMOND, 6, -3.2f))));

    public static final RegistryObject<Item> REDDIAMOND_HOE = ITEMS.register("reddiamond_hoe",
            () -> new HoeItem(ModToolTiers.REDDIAMOND, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.REDDIAMOND, 0, -3.0f))));

    public static final RegistryObject<Item> REDDIAMOND_HELMET =ITEMS.register("reddiamond_helmet",
            () -> new ArmorItem(ModArmorMaterials.REDDIAMOND_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));

    public static final RegistryObject<Item> REDDIAMOND_CHESTPLATE =ITEMS.register("reddiamond_chestplate",
            () -> new ArmorItem(ModArmorMaterials.REDDIAMOND_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));

    public static final RegistryObject<Item> REDDIAMOND_LEGGINGS =ITEMS.register("reddiamond_leggings",
            () -> new ArmorItem(ModArmorMaterials.REDDIAMOND_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));

    public static final RegistryObject<Item> REDDIAMOND_BOOTS =ITEMS.register("reddiamond_boots",
            () -> new ArmorItem(ModArmorMaterials.REDDIAMOND_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

    // FOOD
    public static final RegistryObject<Item> BLUE_BERRY = ITEMS.register("blue_berry",
            () -> new ItemNameBlockItem(ModBlocks.BLUE_BERRY_BUSH.get(), new Item.Properties().food(ModFoodProperies.BLUE_BERRY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
