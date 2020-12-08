package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class NAslowfallProcedure extends ProjecdzModElements.ModElement {
	public NAslowfallProcedure(ProjecdzModElements instance) {
		super(instance, 71);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure NAslowfall!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("NA_SLOW")) == (true))) {
			entity.getPersistentData().putBoolean("NA_SLOW", (false));
		} else if (((entity.getPersistentData().getBoolean("NA_SLOW")) == (false))) {
			entity.getPersistentData().putBoolean("NA_SLOW", (true));
		}
	}
}
