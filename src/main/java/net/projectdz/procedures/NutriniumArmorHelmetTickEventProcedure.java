package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class NutriniumArmorHelmetTickEventProcedure extends ProjecdzModElements.ModElement {
	public NutriniumArmorHelmetTickEventProcedure(ProjecdzModElements instance) {
		super(instance, 55);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NutriniumArmorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("NA_NV")) == (true))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 240, (int) 2, (false), (false)));
		}
	}
}
