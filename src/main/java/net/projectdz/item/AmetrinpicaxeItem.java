
package net.projectdz.item;

import net.projectdz.itemgroup.ProjectDItemGroup;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ProjecdzModElements.ModElement.Tag
public class AmetrinpicaxeItem extends ProjecdzModElements.ModElement {
	@ObjectHolder("projecdz:ametrinpicaxe")
	public static final Item block = null;
	public AmetrinpicaxeItem(ProjecdzModElements instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3255;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AmetrinItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(ProjectDItemGroup.tab)) {
		}.setRegistryName("ametrinpicaxe"));
	}
}
