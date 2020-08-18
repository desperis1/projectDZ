package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.item.ItemStack;

import java.util.Random;
import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class PurplecreamRightClickedOnBlockProcedure extends ProjecdzModElements.ModElement {
	public PurplecreamRightClickedOnBlockProcedure(ProjecdzModElements instance) {
		super(instance, 188);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure PurplecreamRightClickedOnBlock!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
	}
}
