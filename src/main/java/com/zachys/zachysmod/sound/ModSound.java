package com.zachys.zachysmod.sound;

import com.zachys.zachysmod.ZachysMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSound {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ZachysMod.MOD_ID);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(ZachysMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

    public static final RegistryObject<SoundEvent> ELPRESASOUND_BREAK = registerSoundEvents("elpresasound_break");
    public static final RegistryObject<SoundEvent> ELPRESASOUND_STEP = registerSoundEvents("elpresasound_step");
    public static final RegistryObject<SoundEvent> ELPRESASOUND_FALL = registerSoundEvents("elpresasound_fall");
    public static final RegistryObject<SoundEvent> ELPRESASOUND_PLACE = registerSoundEvents("elpresasound_place");
    public static final RegistryObject<SoundEvent> ELPRESASOUND_HIT = registerSoundEvents("elpresasound_hit");

    public static final ForgeSoundType ELPRESASOUNDS = new ForgeSoundType(1f, 1f,
            ModSound.ELPRESASOUND_BREAK, ModSound.ELPRESASOUND_STEP, ModSound.ELPRESASOUND_PLACE,
            ModSound.ELPRESASOUND_HIT, ModSound.ELPRESASOUND_FALL);

}
