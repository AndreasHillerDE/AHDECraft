package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

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

        handheldItem(ModItems.REDDIAMOND_SWORD);
        handheldItem(ModItems.REDDIAMOND_PICKAXE);
        handheldItem(ModItems.REDDIAMOND_SHOVEL);
        handheldItem(ModItems.REDDIAMOND_AXE);
        handheldItem(ModItems.REDDIAMOND_HOE);

        trimmedArmorItem(ModItems.REDDIAMOND_HELMET);
        trimmedArmorItem(ModItems.REDDIAMOND_CHESTPLATE);
        trimmedArmorItem(ModItems.REDDIAMOND_LEGGINGS);
        trimmedArmorItem(ModItems.REDDIAMOND_BOOTS);

        saplingItem(ModBlocks.REDDIAMOND_SAPLING);
        saplingItem(ModBlocks.RUBBER_TREE_SAPLING);

        // FOOD
        basicItem(ModItems.BLUE_BERRY.get());
        basicItem(ModItems.RASPBERRY.get());
        basicItem(ModItems.BLACKBERRY.get());
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AHDECraft.MOD_ID,"block/" + item.getId().getPath()));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = AHDECraft.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AHDECraft.MOD_ID,"item/" + item.getId().getPath()));
    }
}
