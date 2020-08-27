package net.projectdz.procedures;

import net.projectdz.world.dimension.AmetrindimensionDimension;
import net.projectdz.block.HardenedcbbleblockBlock;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class AmetrinteleportationpotionPotionStartedappliedProcedure extends ProjecdzModElements.ModElement {
	public AmetrinteleportationpotionPotionStartedappliedProcedure(ProjecdzModElements instance) {
		super(instance, 203);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AmetrinteleportationpotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AmetrinteleportationpotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AmetrinteleportationpotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AmetrinteleportationpotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AmetrinteleportationpotionPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
				DimensionType destinationType = AmetrindimensionDimension.type;
				ObfuscationReflectionHelper.setPrivateValue(ServerPlayerEntity.class, (ServerPlayerEntity) _ent, true, "field_184851_cj");
				ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
				((ServerPlayerEntity) _ent).connection.sendPacket(new SChangeGameStatePacket(4, 0));
				((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
						nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
				((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
				for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
					((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
				}
				((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
			}
		}
		world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), HardenedcbbleblockBlock.block.getDefaultState(), 3);
	}
}
