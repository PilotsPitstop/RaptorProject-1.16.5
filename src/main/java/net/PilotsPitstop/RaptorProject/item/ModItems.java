package net.PilotsPitstop.RaptorProject.item;

import net.PilotsPitstop.RaptorProject.item.custom.ModSpawnEggItem;
import net.PilotsPitstop.RaptorProject.RaptorProject;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RaptorProject.MOD_ID);
    public static final RegistryObject<Item> FOSSILS = ITEMS.register("fossils",
            () -> new Item(new Item.Properties().group(ModItemGroup.RAPTOR_PROJECT)));

    private static Object ModEntityTypes;
    public static final RegistryObject<Item> raptor_egg = ITEMS.register("raptor_egg",
            () -> new ModSpawnEggItem(net.PilotsPitstop.RaptorProject.entity.ModEntityTypes.VRAPTOR, 0x464f56, 0x1D6336,
                    new Item.Properties().group(ModItemGroup.RAPTOR_PROJECT)));

    public static final RegistryObject<Item> PIGEON_SPAWN_EGG = ITEMS.register("pigeon_spawn_egg",
            () -> new ModSpawnEggItem(net.PilotsPitstop.RaptorProject.entity.ModEntityTypes.PIGEON, 0x879995, 0x576ABC,
                    new Item.Properties().group(ModItemGroup.RAPTOR_PROJECT)));

    public static final RegistryObject<Item> PENJAMIN = ITEMS.register("penjamin",
            () -> new Item(new Item.Properties().group(ModItemGroup.RAPTOR_PROJECT)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}