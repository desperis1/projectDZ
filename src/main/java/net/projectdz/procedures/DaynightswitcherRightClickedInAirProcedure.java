package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class DaynightswitcherRightClickedInAirProcedure extends ProjecdzModElements.ModElement {
	public DaynightswitcherRightClickedInAirProcedure(ProjecdzModElements instance) {
		super(instance, 91);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure DaynightswitcherRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getWorld().getDayTime()) > 12000)) {
			if (world instanceof World)
				world.getWorld().setDayTime((int) 0);
		} else {
			if (((world.getWorld().getDayTime()) < 12000)) {
				if (world instanceof World)
					world.getWorld().setDayTime((int) 12500);
			}
		}
	}
}
