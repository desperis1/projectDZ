package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class NeutriniumswordItemInHandTickProcedure extends ProjecdzModElements.ModElement {
	public NeutriniumswordItemInHandTickProcedure(ProjecdzModElements instance) {
		super(instance, 86);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NeutriniumswordItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, (int) 60, (int) 2, (false), (false)));
	}
}
