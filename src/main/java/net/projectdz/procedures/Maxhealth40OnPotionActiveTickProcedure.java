package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class Maxhealth40OnPotionActiveTickProcedure extends ProjecdzModElements.ModElement {
	public Maxhealth40OnPotionActiveTickProcedure(ProjecdzModElements instance) {
		super(instance, 191);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Maxhealth40OnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 80);
	}
}
