
package net.projectdz.item;

import net.projectdz.procedures.NeutriniumswordItemInHandTickProcedure;
import net.projectdz.itemgroup.ProjectDItemGroup;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

@ProjecdzModElements.ModElement.Tag
public class NutriniumswordItem extends ProjecdzModElements.ModElement {
	@ObjectHolder("projecdz:nutriniumsword")
	public static final Item block = null;
	public NutriniumswordItem(ProjecdzModElements instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 15000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NeutriniumitemItem.block, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(ProjectDItemGroup.tab)) {
			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					NeutriniumswordItemInHandTickProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("nutriniumsword"));
	}
}
