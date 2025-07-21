package com.zachys.zachysmod.item;

import com.zachys.zachysmod.ZachysMod;
import com.zachys.zachysmod.block.ModBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZachysMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ZACHYSMOD_MOD = CREATIVE_MODE_TABS.register("zachysmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.ELPRESANITEINGOT.get()))
                    .title(Component.translatable("creativetab.zachysmod_tab"))
                    .displayItems((pParameters, pOutput) -> {

                      pOutput.accept(ModItem.ELPRESANITEINGOT.get());

                      pOutput.accept(ModBlock.GOLDENCARROTBLOCK.get());
                      pOutput.accept(ModBlock.ELPRESABLOCK.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCK.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSED.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSEDX2.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSEDX3.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSEDX4.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSEDX5.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSEDX6.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSEDX7.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSEDX8.get());
                      pOutput.accept(ModBlock.ELPRESANITEBLOCKCOMPRESSEDX9.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
