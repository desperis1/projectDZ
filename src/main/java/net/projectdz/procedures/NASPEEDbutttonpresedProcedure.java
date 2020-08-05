package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class NASPEEDbutttonpresedProcedure extends ProjecdzModElements.ModElement {
	public NASPEEDbutttonpresedProcedure(ProjecdzModElements instance) {
		super(instance, 61);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NASPEEDbutttonpresed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("NA_SPEED")) == (true))) {
			entity.getPersistentData().putBoolean("NA_SPEED", (false));
		} else if (((entity.getPersistentData().getBoolean("NA_SPEED")) == (false))) {
			entity.getPersistentData().putBoolean("NA_SPEED", (true));
		}
	}
}
