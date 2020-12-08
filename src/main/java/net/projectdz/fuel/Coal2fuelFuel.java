
package net.projectdz.fuel;

import net.projectdz.item.Coal2itemItem;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

@ProjecdzModElements.ModElement.Tag
public class Coal2fuelFuel extends ProjecdzModElements.ModElement {
	public Coal2fuelFuel(ProjecdzModElements instance) {
		super(instance, 23);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Coal2itemItem.block, (int) (1)).getItem())
			event.setBurnTime(10000);
	}
}
