
package net.projectdz.world.dimension;

import net.projectdz.procedures.AmetrindimensionPlayerEntersDimensionProcedure;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.layer.traits.IC0Transformer;
import net.minecraft.world.gen.layer.ZoomLayer;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.IslandLayer;
import net.minecraft.world.gen.area.LazyArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.EndGenerationSettings;
import net.minecraft.world.gen.EndChunkGenerator;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import javax.annotation.Nullable;

import java.util.function.LongFunction;
import java.util.function.BiFunction;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;

@ProjecdzModElements.ModElement.Tag
public class AmetrindimensionDimension extends ProjecdzModElements.ModElement {
	@ObjectHolder("projecdz:ametrindimension")
	public static final ModDimension dimension = null;
	public static DimensionType type = null;
	private static Biome[] dimensionBiomes;
	public AmetrindimensionDimension(ProjecdzModElements instance) {
		super(instance, 150);
		MinecraftForge.EVENT_BUS.register(this);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerDimension(RegistryEvent.Register<ModDimension> event) {
		event.getRegistry().register(new CustomModDimension().setRegistryName("ametrindimension"));
	}

	@SubscribeEvent
	public void onRegisterDimensionsEvent(RegisterDimensionsEvent event) {
		if (DimensionType.byName(new ResourceLocation("projecdz:ametrindimension")) == null) {
			DimensionManager.registerDimension(new ResourceLocation("projecdz:ametrindimension"), dimension, null, true);
		}
		type = DimensionType.byName(new ResourceLocation("projecdz:ametrindimension"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		dimensionBiomes = new Biome[]{ForgeRegistries.BIOMES.getValue(new ResourceLocation("projecdz:ameforestdimension")),
				ForgeRegistries.BIOMES.getValue(new ResourceLocation("projecdz:ameforestgold")),
				ForgeRegistries.BIOMES.getValue(new ResourceLocation("flower_forest")),
				ForgeRegistries.BIOMES.getValue(new ResourceLocation("projecdz:ametrinemerald")),
				ForgeRegistries.BIOMES.getValue(new ResourceLocation("bamboo_jungle")),};
	}
	public static class CustomModDimension extends ModDimension {
		@Override
		public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
			return CustomDimension::new;
		}
	}

	public static class CustomDimension extends Dimension {
		private BiomeProviderCustom biomeProviderCustom = null;
		public CustomDimension(World world, DimensionType type) {
			super(world, type, 0.5f);
			this.nether = false;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public Vec3d getFogColor(float cangle, float ticks) {
			return new Vec3d(1, 0.8, 1);
		}

		@Override
		public ChunkGenerator<?> createChunkGenerator() {
			if (this.biomeProviderCustom == null) {
				this.biomeProviderCustom = new BiomeProviderCustom(this.world);
			}
			return new ChunkProviderModded(this.world, this.biomeProviderCustom);
		}

		@Override
		public boolean isSurfaceWorld() {
			return false;
		}

		@Override
		public boolean canRespawnHere() {
			return true;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public boolean doesXZShowFog(int x, int z) {
			return false;
		}

		@Override
		public SleepResult canSleepAt(PlayerEntity player, BlockPos pos) {
			return SleepResult.ALLOW;
		}

		@Nullable
		public BlockPos findSpawn(ChunkPos chunkPos, boolean checkValid) {
			return null;
		}

		@Nullable
		public BlockPos findSpawn(int x, int z, boolean checkValid) {
			return null;
		}

		@Override
		public boolean doesWaterVaporize() {
			return false;
		}

		@Override /**
					 * Calculates the angle of sun and moon in the sky relative to a specified time
					 * (usually worldTime)
					 */
		public float calculateCelestialAngle(long worldTime, float partialTicks) {
			double d0 = MathHelper.frac((double) worldTime / 24000.0D - 0.25D);
			double d1 = 0.5D - Math.cos(d0 * Math.PI) / 2.0D;
			return (float) (d0 * 2.0D + d1) / 3.0F;
		}
	}
	@SubscribeEvent
	public void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		World world = entity.world;
		double x = entity.getPosX();
		double y = entity.getPosY();
		double z = entity.getPosZ();
		if (event.getTo() == type) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AmetrindimensionPlayerEntersDimensionProcedure.executeProcedure($_dependencies);
			}
		}
	}
	public static class ChunkProviderModded extends EndChunkGenerator {
		public ChunkProviderModded(IWorld world, BiomeProvider provider) {
			super(world, provider, new EndGenerationSettings() {
				public BlockState getDefaultBlock() {
					return Blocks.STONE.getDefaultState();
				}

				public BlockState getDefaultFluid() {
					return Blocks.WATER.getDefaultState();
				}
			});
			this.randomSeed.skip(3946);
		}
	}

	public static class BiomeLayerCustom implements IC0Transformer {
		@Override
		public int apply(INoiseRandom context, int value) {
			return Registry.BIOME.getId(dimensionBiomes[context.random(dimensionBiomes.length)]);
		}
	}

	public static class BiomeProviderCustom extends BiomeProvider {
		private Layer genBiomes;
		public BiomeProviderCustom(World world) {
			super(new HashSet<Biome>(Arrays.asList(dimensionBiomes)));
			this.genBiomes = getBiomeLayer(world.getSeed());
		}

		public Biome getNoiseBiome(int x, int y, int z) {
			return this.genBiomes.func_215738_a(x, z);
		}

		private Layer getBiomeLayer(long seed) {
			LongFunction<IExtendedNoiseRandom<LazyArea>> contextFactory = l -> new LazyAreaLayerContext(25, seed, l);
			IAreaFactory<LazyArea> parentLayer = IslandLayer.INSTANCE.apply(contextFactory.apply(1));
			IAreaFactory<LazyArea> biomeLayer = (new BiomeLayerCustom()).apply(contextFactory.apply(200), parentLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1000), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1001), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1002), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1003), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1004), biomeLayer);
			biomeLayer = ZoomLayer.NORMAL.apply(contextFactory.apply(1005), biomeLayer);
			return new Layer(biomeLayer);
		}
	}
}
