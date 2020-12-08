
package net.projectdz.item;

import net.projectdz.procedures.AchievmentprocedureProcedure;
import net.projectdz.itemgroup.ProjectDItemGroup;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Map;
import java.util.HashMap;

@ProjecdzModElements.ModElement.Tag
public class BMdovodyhodItem extends ProjecdzModElements.ModElement {
	@ObjectHolder("projecdz:bmdovodyhod")
	public static final Item block = null;
	public BMdovodyhodItem(ProjecdzModElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ProjecdzModElements.sounds.get(new ResourceLocation("projecdz:bm_dovody")),
					new Item.Properties().group(ProjectDItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("bmdovodyhod");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
			super.onCreated(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				AchievmentprocedureProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
