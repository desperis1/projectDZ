
package net.projectdz.item;

import net.projectdz.itemgroup.ProjectDItemGroup;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@ProjecdzModElements.ModElement.Tag
public class AmetrinaxeItem extends ProjecdzModElements.ModElement {
	@ObjectHolder("projecdz:ametrinaxe")
	public static final Item block = null;
	public AmetrinaxeItem(ProjecdzModElements instance) {
		super(instance, 111);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3255;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 5f;
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
		}, 1, -2f, new Item.Properties().group(ProjectDItemGroup.tab)) {
		}.setRegistryName("ametrinaxe"));
	}
}
