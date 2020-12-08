
package net.projectdz.fuel;

import net.projectdz.item.Coal3itemItem;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

@ProjecdzModElements.ModElement.Tag
public class Coal3fuelFuel extends ProjecdzModElements.ModElement {
	public Coal3fuelFuel(ProjecdzModElements instance) {
		super(instance, 31);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Coal3itemItem.block, (int) (1)).getItem())
			event.setBurnTime(25000);
	}
}
