package net.projectdz.procedures;

import net.projectdz.ProjecdzModVariables;
import net.projectdz.ProjecdzModElements;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collections;

@ProjecdzModElements.ModElement.Tag
public class HomeCommandExecutedProcedure extends ProjecdzModElements.ModElement {
	public HomeCommandExecutedProcedure(ProjecdzModElements instance) {
		super(instance, 214);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure HomeCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(
					((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_x),
					((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_y),
					((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_z));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(
						((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_x),
						((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_y),
						((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_z),
						_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Now you are at home."), (true));
		}
	}
}
