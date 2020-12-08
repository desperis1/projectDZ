package net.projectdz.procedures;

import net.projectdz.ProjecdzModVariables;
import net.projectdz.ProjecdzModElements;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class SethomeCommandExecutedProcedure extends ProjecdzModElements.ModElement {
	public SethomeCommandExecutedProcedure(ProjecdzModElements instance) {
		super(instance, 216);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SethomeCommandExecuted!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure SethomeCommandExecuted!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure SethomeCommandExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure SethomeCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		{
			double _setval = (double) x;
			entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.player_home_x = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) y;
			entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.player_home_y = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) z;
			entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.player_home_z = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Your home is at:") + "" + ("  X:") + ""
					+ (Math.round(((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_x)))
					+ "" + ("  Y:") + ""
					+ (Math.round(((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_y)))
					+ "" + ("  Z:") + "" + (Math.round(((entity.getCapability(ProjecdzModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ProjecdzModVariables.PlayerVariables())).player_home_z))))),
					(true));
		}
	}
}
