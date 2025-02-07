package de.maxhenkel.camera;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {

    //https://www.soundjay.com/mechanical/sounds/camera-shutter-click-01.mp3
    public static SoundEvent TAKE_IMAGE = registerSound("take_image");

    public static SoundEvent registerSound(String soundName) {
        SoundEvent event = new SoundEvent(new ResourceLocation(Main.MODID, soundName));
        event.setRegistryName(new ResourceLocation(Main.MODID, soundName));
        return event;
    }

}
