package net.modandrew.testmod.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.modandrew.testmod.TestMod;
import net.modandrew.testmod.item.custom.BelliSwordItem;
import net.modandrew.testmod.item.custom.HammerItem;
import net.modandrew.testmod.item.custom.ModArmorItem;

import java.awt.event.InputEvent;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.MOD_GROUP).maxStackSize(64).isImmuneToFire()));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            ()-> new SwordItem(ModItemTier.AMETHYST, 2, -2f, new Item.Properties().group(ModItemGroup.MOD_GROUP)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            ()-> new PickaxeItem(ModItemTier.AMETHYST, -2, -1f, new Item.Properties().group(ModItemGroup.MOD_GROUP)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            ()-> new ShovelItem(ModItemTier.AMETHYST, -3, -1f, new Item.Properties().group(ModItemGroup.MOD_GROUP)));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            ()-> new AxeItem(ModItemTier.AMETHYST, 4, -3f, new Item.Properties().group(ModItemGroup.MOD_GROUP)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            ()-> new HoeItem(ModItemTier.AMETHYST, -5, 2f, new Item.Properties().group(ModItemGroup.MOD_GROUP)));

    public static final RegistryObject<Item> HAMMER = ITEMS.register("amethyst_hammer",
            () -> new HammerItem(ModItemTier.AMETHYST, 5, -3.5f,
                    new Item.Properties().group(ModItemGroup.MOD_GROUP).maxStackSize(1)));

    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET,
                    new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ModArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BELLISWORD = ITEMS.register("bellisword",
            () -> new BelliSwordItem(ItemTier.NETHERITE, 2147483647, 10f,
                    new Item.Properties().group(ItemGroup.FOOD)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
