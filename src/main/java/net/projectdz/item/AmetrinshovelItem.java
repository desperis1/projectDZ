
package net.projectdz.item;

import net.projectdz.itemgroup.ProjectDItemGroup;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ProjecdzModElements.ModElement.Tag
public class AmetrinshovelItem extends ProjecdzModElements.ModElement {
	@ObjectHolder("projecdz:ametrinshovel")
	public static final Item block = null;
	public AmetrinshovelItem(ProjecdzModElements instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3255;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 11;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AmetrinItem.block, (int) (1)));
			}
		}, 1, -1f, new Item.Properties().group(ProjectDItemGroup.tab)) {
		}.setRegistryName("ametrinshovel"));
	}
}
