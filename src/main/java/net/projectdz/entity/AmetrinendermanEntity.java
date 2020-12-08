
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@ProjecdzModElements.ModElement.Tag
public class AmetrinendermanEntity extends ProjecdzModElements.ModElement {
	public static EntityType entity = null;
	public AmetrinendermanEntity(ProjecdzModElements instance) {
		super(instance, 170);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("ametrinenderman")
						.setRegistryName("ametrinenderman");
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -16777216, -6750055, new Item.Properties().group(ItemGroup.MISC))
				.setRegistryName("ametrinenderman_spawn_egg"));
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
			biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(entity, 20, 4, 4));
		}
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawn);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("projecdz:textures/enderman.png.png");
				}
			};
		});
	}
	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
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
			this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, false));
			this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
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
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
		}
	}

	// Made with Blockbench 3.6.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer stick1;
		private final ModelRenderer stick2;
		private final ModelRenderer stick3;
		private final ModelRenderer stick4;
		private final ModelRenderer stick5;
		private final ModelRenderer stick6;
		private final ModelRenderer stick7;
		private final ModelRenderer stick8;
		private final ModelRenderer stick9;
		private final ModelRenderer stick10;
		private final ModelRenderer stick11;
		private final ModelRenderer stick12;
		public Modelcustom_model() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			stick1 = new ModelRenderer(this);
			stick1.setRotationPoint(7.0F, -2.0F, -7.0F);
			stick1.setTextureOffset(0, 16).addBox(-15.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick2 = new ModelRenderer(this);
			stick2.setRotationPoint(-7.0F, -2.0F, -7.0F);
			stick2.setTextureOffset(0, 16).addBox(13.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick3 = new ModelRenderer(this);
			stick3.setRotationPoint(-7.0F, -2.0F, 7.0F);
			stick3.setTextureOffset(0, 16).addBox(13.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick4 = new ModelRenderer(this);
			stick4.setRotationPoint(7.0F, -2.0F, 7.0F);
			stick4.setTextureOffset(0, 16).addBox(-15.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick5 = new ModelRenderer(this);
			stick5.setRotationPoint(5.0F, 2.0F, -5.0F);
			stick5.setTextureOffset(0, 16).addBox(-11.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick6 = new ModelRenderer(this);
			stick6.setRotationPoint(-5.0F, 2.0F, -5.0F);
			stick6.setTextureOffset(0, 16).addBox(9.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick7 = new ModelRenderer(this);
			stick7.setRotationPoint(-5.0F, 2.0F, 5.0F);
			stick7.setTextureOffset(0, 16).addBox(9.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick8 = new ModelRenderer(this);
			stick8.setRotationPoint(5.0F, 2.0F, 5.0F);
			stick8.setTextureOffset(0, 16).addBox(-11.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick9 = new ModelRenderer(this);
			stick9.setRotationPoint(3.0F, 10.0F, -3.0F);
			stick9.setTextureOffset(0, 16).addBox(-7.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick10 = new ModelRenderer(this);
			stick10.setRotationPoint(-3.0F, 10.0F, -3.0F);
			stick10.setTextureOffset(0, 16).addBox(5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick11 = new ModelRenderer(this);
			stick11.setRotationPoint(-3.0F, 10.0F, 3.0F);
			stick11.setTextureOffset(0, 16).addBox(5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick12 = new ModelRenderer(this);
			stick12.setRotationPoint(3.0F, 10.0F, 3.0F);
			stick12.setTextureOffset(0, 16).addBox(-7.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			stick1.render(matrixStack, buffer, packedLight, packedOverlay);
			stick2.render(matrixStack, buffer, packedLight, packedOverlay);
			stick3.render(matrixStack, buffer, packedLight, packedOverlay);
			stick4.render(matrixStack, buffer, packedLight, packedOverlay);
			stick5.render(matrixStack, buffer, packedLight, packedOverlay);
			stick6.render(matrixStack, buffer, packedLight, packedOverlay);
			stick7.render(matrixStack, buffer, packedLight, packedOverlay);
			stick8.render(matrixStack, buffer, packedLight, packedOverlay);
			stick9.render(matrixStack, buffer, packedLight, packedOverlay);
			stick10.render(matrixStack, buffer, packedLight, packedOverlay);
			stick11.render(matrixStack, buffer, packedLight, packedOverlay);
			stick12.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.stick12.rotateAngleY = f2 / 20.f;
			this.stick11.rotateAngleY = f2;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.stick1.rotateAngleY = f2;
			this.stick3.rotateAngleY = f2;
			this.stick2.rotateAngleY = f2;
			this.stick5.rotateAngleY = f2;
			this.stick4.rotateAngleY = f2;
			this.stick7.rotateAngleY = f2;
			this.stick6.rotateAngleY = f2;
			this.stick9.rotateAngleY = f2;
			this.stick8.rotateAngleY = f2;
			this.stick10.rotateAngleY = f2;
		}
	}
}
