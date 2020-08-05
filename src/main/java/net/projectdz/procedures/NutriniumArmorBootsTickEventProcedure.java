package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class NutriniumArmorBootsTickEventProcedure extends ProjecdzModElements.ModElement {
	public NutriniumArmorBootsTickEventProcedure(ProjecdzModElements instance) {
		super(instance, 62);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NutriniumArmorBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("NA_SPEED")) == (true))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 20, (int) 1, (false), (false)));
		}
	}
}
