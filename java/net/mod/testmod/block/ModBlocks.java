package net.modandrew.testmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.modandrew.testmod.TestMod;
import net.modandrew.testmod.item.ModItemGroup;
import net.modandrew.testmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MOD_ID);

    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));


    public static final RegistryObject<Block> BELLIUM = registerBlock1("bellium",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<T> registerBlock1(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem1(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.MOD_GROUP)));
    }
    private static <T extends Block> void registerBlockItem1(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ItemGroup.FOOD)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
