package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class NAINVbuttonpressProcedure extends ProjecdzModElements.ModElement {
	public NAINVbuttonpressProcedure(ProjecdzModElements instance) {
		super(instance, 76);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NAINVbuttonpress!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("NA_INV")) == (true))) {
			entity.getPersistentData().putBoolean("NA_INV", (false));
		} else if (((entity.getPersistentData().getBoolean("NA_INV")) == (false))) {
			entity.getPersistentData().putBoolean("NA_INV", (true));
		}
	}
}
