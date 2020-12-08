package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class AdminMENUThisGUIIsOpenedProcedure extends ProjecdzModElements.ModElement {
	public AdminMENUThisGUIIsOpenedProcedure(ProjecdzModElements instance) {
		super(instance, 218);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure AdminMENUThisGUIIsOpened!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.hasPermissionLevel((int) 0)) || (entity.hasPermissionLevel((int) 1)))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
		}
	}
}
