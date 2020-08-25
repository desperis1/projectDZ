package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Random;
import java.util.Map;
import java.util.Collection;

@ProjecdzModElements.ModElement.Tag
public class BlueplantcreamRightClickedOnBlockProcedure extends ProjecdzModElements.ModElement {
	public BlueplantcreamRightClickedOnBlockProcedure(ProjecdzModElements instance) {
		super(instance, 187);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlueplantcreamRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure BlueplantcreamRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) ((new Object() {
				int check(LivingEntity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = _entity.getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == Effects.HEALTH_BOOST)
								return effect.getDuration();
						}
					}
					return 0;
				}
			}.check((LivingEntity) entity)) + 1200), (int) 1, (false), (false)));
	}
}
