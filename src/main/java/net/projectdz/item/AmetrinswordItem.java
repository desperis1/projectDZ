
package net.projectdz.item;

import net.projectdz.itemgroup.ProjectDItemGroup;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ProjecdzModElements.ModElement.Tag
public class AmetrinswordItem extends ProjecdzModElements.ModElement {
	@ObjectHolder("projecdz:ametrinsword")
	public static final Item block = null;
	public AmetrinswordItem(ProjecdzModElements instance) {
		super(instance, 113);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3255;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 3, -1.5f, new Item.Properties().group(ProjectDItemGroup.tab)) {
		}.setRegistryName("ametrinsword"));
	}
}
