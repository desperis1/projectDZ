
package net.projectdz.item;

import net.projectdz.itemgroup.ProjectDItemGroup;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@ProjecdzModElements.ModElement.Tag
public class BlazedfoodItem extends ProjecdzModElements.ModElement {
	@ObjectHolder("projecdz:blazedfood")
	public static final Item block = null;
	public BlazedfoodItem(ProjecdzModElements instance) {
		super(instance, 93);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ProjectDItemGroup.tab).maxStackSize(64).food((new Food.Builder()).hunger(24).saturation(40f).build()));
			setRegistryName("blazedfood");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 15;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}