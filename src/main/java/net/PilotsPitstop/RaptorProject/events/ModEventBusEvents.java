package net.PilotsPitstop.RaptorProject.events;

import net.PilotsPitstop.RaptorProject.RaptorProject;
import net.PilotsPitstop.RaptorProject.entity.ModEntityTypes;
import net.PilotsPitstop.RaptorProject.entity.custom.PigeonEntity;
import net.PilotsPitstop.RaptorProject.entity.custom.vraptorEntity;
import net.PilotsPitstop.RaptorProject.item.custom.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RaptorProject.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.VRAPTOR.get(), vraptorEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.PIGEON.get(), PigeonEntity.setCustomAttributes().create());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
