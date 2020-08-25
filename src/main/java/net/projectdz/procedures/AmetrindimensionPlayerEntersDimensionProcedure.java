package net.projectdz.procedures;

import net.projectdz.block.HardenedcbbleblockBlock;
import net.projectdz.ProjecdzModElements;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class AmetrindimensionPlayerEntersDimensionProcedure extends ProjecdzModElements.ModElement {
	public AmetrindimensionPlayerEntersDimensionProcedure(ProjecdzModElements instance) {
		super(instance, 192);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AmetrindimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AmetrindimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AmetrindimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AmetrindimensionPlayerEntersDimension!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), HardenedcbbleblockBlock.block.getDefaultState(), 3);
	}
}