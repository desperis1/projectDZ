package net.projectdz.procedures;

import net.projectdz.item.IrondustItem;
import net.projectdz.item.HardcobbledustItem;
import net.projectdz.item.GolddustItem;
import net.projectdz.item.DiamonddustItem;
import net.projectdz.item.AmetrindustItem;
import net.projectdz.block.HardenedcbbleblockBlock;
import net.projectdz.block.AmetrinoreBlock;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class DrtickatickupdateProcedure extends ProjecdzModElements.ModElement {
	public DrtickatickupdateProcedure(ProjecdzModElements instance) {
		super(instance, 126);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Drtickatickupdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Drtickatickupdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Drtickatickupdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Drtickatickupdate!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(HardenedcbbleblockBlock.block, (int) (1))
				.getItem()) && (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						AtomicInteger _retval = new AtomicInteger(0);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).getCount());
							});
						}
						return _retval.get();
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0) || ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(HardcobbledustItem.block, (int) (1))
						.getItem())))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (0);
					final ItemStack _setstack = new ItemStack(HardenedcbbleblockBlock.block, (int) (1));
					_setstack.setCount((int) ((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (1);
					final ItemStack _setstack = new ItemStack(HardcobbledustItem.block, (int) (1));
					_setstack.setCount((int) ((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 2));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (!world.getWorld().isRemote) {
				world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
						SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5);
			} else {
				world.getWorld().playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
						SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5, false);
			}
		} else {
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.IRON_ORE, (int) (1)).getItem())
					&& (((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0) || ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
							}
							return _retval.get();
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(IrondustItem.block, (int) (1))
							.getItem())))) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(Blocks.IRON_ORE, (int) (1));
						_setstack.setCount((int) ((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (1);
						final ItemStack _setstack = new ItemStack(IrondustItem.block, (int) (1));
						_setstack.setCount((int) ((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 2));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
							SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
							SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5, false);
				}
			} else {
				if ((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.GOLD_ORE, (int) (1)).getItem())
						&& (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(GolddustItem.block, (int) (1))
								.getItem())))) {
					{
						TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (_ent != null) {
							final int _sltid = (int) (0);
							final ItemStack _setstack = new ItemStack(Blocks.GOLD_ORE, (int) (1));
							_setstack.setCount((int) ((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
								}
							});
						}
					}
					{
						TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (_ent != null) {
							final int _sltid = (int) (1);
							final ItemStack _setstack = new ItemStack(GolddustItem.block, (int) (1));
							_setstack.setCount((int) ((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 2));
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
								}
							});
						}
					}
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
								SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
								SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5, false);
					}
				} else {
					if ((((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
							}
							return _retval.get();
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.DIAMOND_ORE, (int) (1))
							.getItem()) && (((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0) || ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(DiamonddustItem.block, (int) (1)).getItem())))) {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) (0);
								final ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE, (int) (1));
								_setstack.setCount((int) ((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										AtomicInteger _retval = new AtomicInteger(0);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).getCount());
											});
										}
										return _retval.get();
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) (1);
								final ItemStack _setstack = new ItemStack(DiamonddustItem.block, (int) (1));
								_setstack.setCount((int) ((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										AtomicInteger _retval = new AtomicInteger(0);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).getCount());
											});
										}
										return _retval.get();
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 2));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
						if (!world.getWorld().isRemote) {
							world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
									SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5);
						} else {
							world.getWorld().playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")),
									SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5, false);
						}
					} else {
						if ((((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
								.getItem() == new ItemStack(AmetrinoreBlock.block, (int) (1)).getItem()) && (((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										AtomicInteger _retval = new AtomicInteger(0);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).getCount());
											});
										}
										return _retval.get();
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0) || ((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
										.getItem() == new ItemStack(AmetrindustItem.block, (int) (1)).getItem())))) {
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final ItemStack _setstack = new ItemStack(AmetrinoreBlock.block, (int) (1));
									_setstack.setCount((int) ((new Object() {
										public int getAmount(BlockPos pos, int sltid) {
											AtomicInteger _retval = new AtomicInteger(0);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).getCount());
												});
											}
											return _retval.get();
										}
									}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
										}
									});
								}
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (1);
									final ItemStack _setstack = new ItemStack(AmetrindustItem.block, (int) (1));
									_setstack.setCount((int) ((new Object() {
										public int getAmount(BlockPos pos, int sltid) {
											AtomicInteger _retval = new AtomicInteger(0);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).getCount());
												});
											}
											return _retval.get();
										}
									}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 2));
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
										}
									});
								}
							}
							if (!world.getWorld().isRemote) {
								world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.item.break")),
										SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5);
							} else {
								world.getWorld().playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.item.break")),
										SoundCategory.NEUTRAL, (float) 0.2, (float) 0.5, false);
							}
						}
					}
				}
			}
		}
	}
}
