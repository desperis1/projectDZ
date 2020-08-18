
package net.projectdz.entity;

import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@ProjecdzModElements.ModElement.Tag
public class ClawgoblinEntity extends ProjecdzModElements.ModElement {
	public static EntityType entity = null;
	public ClawgoblinEntity(ProjecdzModElements instance) {
		super(instance, 171);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 2.2f)).build("clawgoblin")
						.setRegistryName("clawgoblin");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -3407719, -16764160, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("clawgoblin"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			boolean biomeCriteria = false;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("projecdz:ameforestdimension")))
				biomeCriteria = true;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("projecdz:ameforestgold")))
				biomeCriteria = true;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("projecdz:ametrinemerald")))
				biomeCriteria = true;
			if (!biomeCriteria)
				continue;
			biome.getSpawns(EntityClassification.AMBIENT).add(new Biome.SpawnListEntry(entity, 200, 1, 2));
		}
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS,
				Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelclaws_goblin(), 0.9f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("projecdz:textures/claw_goblin_texture.png");
				}
			};
		});
	}
	public static class CustomEntity extends CreatureEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 15;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.8));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ServerPlayerEntity.class, false, false));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(8);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10);
		}
	}

	// Made with Blockbench 3.6.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelclaws_goblin extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;
		public Modelclaws_goblin() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -7.0F, 0.0F);
			body.setTextureOffset(0, 105).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F, false);
			body.setTextureOffset(98, 117).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, 7.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, 4.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, 10.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -9.0F, -2.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(59, 57).addBox(4.0F, -12.0F, -2.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(57, 56).addBox(-6.0F, -12.0F, -2.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-11.0F, -7.0F, 0.0F);
			setRotationAngle(right_arm, -0.3927F, 0.0F, 0.0F);
			right_arm.setTextureOffset(0, 0).addBox(-2.0F, 15.2451F, 1.877F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 0).addBox(-2.0F, 15.0866F, -0.3534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 0).addBox(-2.0F, 14.9281F, -2.5838F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(108, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 18.0F, 6.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(22.0F, 0.0F, 0.0F);
			right_arm.addChild(left_arm);
			left_arm.setTextureOffset(0, 0).addBox(1.0F, 14.9281F, -2.5838F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 0).addBox(1.0F, 15.0866F, -0.3534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 0).addBox(1.0F, 15.2451F, 1.877F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(108, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 18.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-5.0F, 11.0F, 0.0F);
			right_leg.setTextureOffset(106, 52).addBox(-2.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 0).addBox(-2.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 0).addBox(0.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 0).addBox(2.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.0F, 11.0F, 0.0F);
			left_leg.setTextureOffset(0, 0).addBox(-2.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(0.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(2.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(106, 52).addBox(-2.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
