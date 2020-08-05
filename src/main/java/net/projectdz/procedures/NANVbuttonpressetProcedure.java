package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class NANVbuttonpressetProcedure extends ProjecdzModElements.ModElement {
	public NANVbuttonpressetProcedure(ProjecdzModElements instance) {
		super(instance, 60);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NANVbuttonpresset!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		boolean NA_nightvision = false;
		if (((entity.getPersistentData().getBoolean("NA_NV")) == (true))) {
			entity.getPersistentData().putBoolean("NA_NV", (false));
		} else if (((entity.getPersistentData().getBoolean("NA_NV")) == (false))) {
			entity.getPersistentData().putBoolean("NA_NV", (true));
		}
	}
}
