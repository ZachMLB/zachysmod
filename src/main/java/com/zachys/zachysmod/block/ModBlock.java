package com.zachys.zachysmod.block;

import com.zachys.zachysmod.ZachysMod;
import com.zachys.zachysmod.item.ModItem;
import com.zachys.zachysmod.sound.ModSound;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.client.model.obj.ObjModel;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ZachysMod.MOD_ID);

    public static final RegistryObject<Block> GOLDENCARROTBLOCK = registerBlock("goldencarrotblock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK)));

    public static final RegistryObject<Block> ELPRESABLOCK = registerBlock("elpresablock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(ModSound.ELPRESASOUNDS)));

    public static final RegistryObject<Block> ELPRESANITEBLOCK = registerBlock("elpresaniteblock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSED = registerBlock("elpresaniteblockcompressed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSEDX2 = registerBlock("elpresaniteblockcompressedx2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSEDX3 = registerBlock("elpresaniteblockcompressedx3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSEDX4 = registerBlock("elpresaniteblockcompressedx4",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSEDX5 = registerBlock("elpresaniteblockcompressedx5",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSEDX6 = registerBlock("elpresaniteblockcompressedx6",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSEDX7 = registerBlock("elpresaniteblockcompressedx7",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSEDX8 = registerBlock("elpresaniteblockcompressedx8",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ELPRESANITEBLOCKCOMPRESSEDX9 = registerBlock("elpresaniteblockcompressedx9",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block) {
        return ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
