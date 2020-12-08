package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class EnergyNACommandExecutedProcedure extends ProjecdzModElements.ModElement {
	public EnergyNACommandExecutedProcedure(ProjecdzModElements instance) {
		super(instance, 70);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure EnergyNACommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList()
						.sendMessage(new StringTextComponent((("Energy is on:") + "" + ((entity.getPersistentData().getDouble("NA_E"))))));
		}
	}
}
