package net.PilotsPitstop.RaptorProject.events;

import com.mojang.brigadier.CommandDispatcher;
import net.PilotsPitstop.RaptorProject.RaptorProject;
import net.minecraft.command.CommandSource;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = RaptorProject.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
        if(!event.getOriginal().getEntityWorld().isRemote()) {
            event.getPlayer().getPersistentData().putIntArray(RaptorProject.MOD_ID + "homepos",
                    event.getOriginal().getPersistentData().getIntArray(RaptorProject.MOD_ID + "homepos"));
        }
    }

    private static class SetHomeCommand {
        public SetHomeCommand(CommandDispatcher<CommandSource> dispatcher) {
        }
    }
}