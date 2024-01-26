package net.PilotsPitstop.RaptorProject.world;

import net.PilotsPitstop.RaptorProject.RaptorProject;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.PilotsPitstop.RaptorProject.world.gen.ModOreGeneration;


@Mod.EventBusSubscriber(modid = RaptorProject.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

    }
}