
package net.projectdz.fuel;

import net.projectdz.item.Coal1itemItem;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

@ProjecdzModElements.ModElement.Tag
public class Coal1fuelFuel extends ProjecdzModElements.ModElement {
	public Coal1fuelFuel(ProjecdzModElements instance) {
		super(instance, 19);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Coal1itemItem.block, (int) (1)).getItem())
			event.setBurnTime(2400);
	}
}
