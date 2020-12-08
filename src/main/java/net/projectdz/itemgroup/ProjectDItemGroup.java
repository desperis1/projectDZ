
package net.projectdz.itemgroup;

import net.projectdz.item.AntimatterItem;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ProjecdzModElements.ModElement.Tag
public class ProjectDItemGroup extends ProjecdzModElements.ModElement {
	public ProjectDItemGroup(ProjecdzModElements instance) {
		super(instance, 141);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabproject_d") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AntimatterItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
