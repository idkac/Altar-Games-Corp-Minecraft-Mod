package net.modandrew.testmod.item.world;


import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.modandrew.testmod.TestMod;
import net.modandrew.testmod.item.world.gen.ModOreGeneration;


@Mod.EventBusSubscriber(modid = TestMod.MOD_ID)
public class ModWorldEvents {


    @SubscribeEvent
    public static void biomeloadingEvent(final BiomeLoadingEvent event)
    {
        ModOreGeneration.generateOres(event);
    }
}
