package net.PilotsPitstop.RaptorProject.entity;

import net.PilotsPitstop.RaptorProject.RaptorProject;
import net.PilotsPitstop.RaptorProject.entity.custom.PigeonEntity;
import net.PilotsPitstop.RaptorProject.entity.custom.vraptorEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, RaptorProject.MOD_ID);

    public static final RegistryObject<EntityType<vraptorEntity>> VRAPTOR =
            ENTITY_TYPES.register("vraptor",
                    () -> EntityType.Builder.create(vraptorEntity::new,
                                    EntityClassification.MONSTER).size(1f, 3f)
                            .build(new ResourceLocation(RaptorProject.MOD_ID, "vraptor").toString()));

    public static final RegistryObject<EntityType<PigeonEntity>> PIGEON =
            ENTITY_TYPES.register("pigeon",
                    () -> EntityType.Builder.create(PigeonEntity::new,
                                    EntityClassification.CREATURE).size(0.4f, 0.3f)
                            .build(new ResourceLocation(RaptorProject.MOD_ID, "pigeon").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}