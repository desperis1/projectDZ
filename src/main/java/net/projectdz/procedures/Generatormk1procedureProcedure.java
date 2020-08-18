package net.projectdz.procedures;

import net.projectdz.ProjecdzModElements;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class Generatormk1procedureProcedure extends ProjecdzModElements.ModElement {
	public Generatormk1procedureProcedure(ProjecdzModElements instance) {
		super(instance, 79);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Generatormk1procedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Generatormk1procedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Generatormk1procedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Generatormk1procedure!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) >= 500)) {
			if (((new Object() {
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1))
					.getItem())) {
				if ((Math.random() < 0.7)) {
					{
						TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (_ent != null) {
							final int _sltid = (int) (1);
							final ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE, (int) (1));
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
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
								}
							});
						}
					}
					{
						TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						int _amount = (int) 500;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
				}
			} else {
				if (((new Object() {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.STONE, (int) (1)).getItem())) {
					if ((Math.random() < 0.7)) {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (_ent != null) {
								final int _sltid = (int) (1);
								final ItemStack _setstack = new ItemStack(Blocks.STONE, (int) (1));
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
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
						{
							TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							int _amount = (int) 500;
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
						}
					}
				} else {
					if (((new Object() {
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
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.OAK_LOG, (int) (1))
							.getItem())) {
						if ((Math.random() < 0.6)) {
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (1);
									final ItemStack _setstack = new ItemStack(Blocks.OAK_LOG, (int) (1));
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
									}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
										}
									});
								}
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								int _amount = (int) 500;
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
						}
					} else {
						if (((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.SPRUCE_LOG, (int) (1))
								.getItem())) {
							if ((Math.random() < 0.6)) {
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (1);
										final ItemStack _setstack = new ItemStack(Blocks.SPRUCE_LOG, (int) (1));
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
										}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
											}
										});
									}
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									int _amount = (int) 500;
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> capability.extractEnergy(_amount, false));
								}
							}
						} else {
							if (((new Object() {
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
									.getItem() == new ItemStack(Blocks.BIRCH_LOG, (int) (1)).getItem())) {
								if ((Math.random() < 0.6)) {
									{
										TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
										if (_ent != null) {
											final int _sltid = (int) (1);
											final ItemStack _setstack = new ItemStack(Blocks.BIRCH_LOG, (int) (1));
											_setstack.setCount((int) ((new Object() {
												public int getAmount(BlockPos pos, int sltid) {
													AtomicInteger _retval = new AtomicInteger(0);
													TileEntity _ent = world.getTileEntity(pos);
													if (_ent != null) {
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																.ifPresent(capability -> {
																	_retval.set(capability.getStackInSlot(sltid).getCount());
																});
													}
													return _retval.get();
												}
											}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
												}
											});
										}
									}
									{
										TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
										int _amount = (int) 500;
										if (_ent != null)
											_ent.getCapability(CapabilityEnergy.ENERGY, null)
													.ifPresent(capability -> capability.extractEnergy(_amount, false));
									}
								}
							} else {
								if (((new Object() {
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
										.getItem() == new ItemStack(Blocks.JUNGLE_LOG, (int) (1)).getItem())) {
									if ((Math.random() < 0.6)) {
										{
											TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
											if (_ent != null) {
												final int _sltid = (int) (1);
												final ItemStack _setstack = new ItemStack(Blocks.JUNGLE_LOG, (int) (1));
												_setstack.setCount((int) ((new Object() {
													public int getAmount(BlockPos pos, int sltid) {
														AtomicInteger _retval = new AtomicInteger(0);
														TileEntity _ent = world.getTileEntity(pos);
														if (_ent != null) {
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		_retval.set(capability.getStackInSlot(sltid).getCount());
																	});
														}
														return _retval.get();
													}
												}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable) {
														((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
													}
												});
											}
										}
										{
											TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
											int _amount = (int) 500;
											if (_ent != null)
												_ent.getCapability(CapabilityEnergy.ENERGY, null)
														.ifPresent(capability -> capability.extractEnergy(_amount, false));
										}
									}
								} else {
									if (((new Object() {
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
											.getItem() == new ItemStack(Blocks.ACACIA_LOG, (int) (1)).getItem())) {
										if ((Math.random() < 0.6)) {
											{
												TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
												if (_ent != null) {
													final int _sltid = (int) (1);
													final ItemStack _setstack = new ItemStack(Blocks.ACACIA_LOG, (int) (1));
													_setstack.setCount((int) ((new Object() {
														public int getAmount(BlockPos pos, int sltid) {
															AtomicInteger _retval = new AtomicInteger(0);
															TileEntity _ent = world.getTileEntity(pos);
															if (_ent != null) {
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																		.ifPresent(capability -> {
																			_retval.set(capability.getStackInSlot(sltid).getCount());
																		});
															}
															return _retval.get();
														}
													}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable) {
															((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
														}
													});
												}
											}
											{
												TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
												int _amount = (int) 500;
												if (_ent != null)
													_ent.getCapability(CapabilityEnergy.ENERGY, null)
															.ifPresent(capability -> capability.extractEnergy(_amount, false));
											}
										}
									} else {
										if (((new Object() {
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
												.getItem() == new ItemStack(Blocks.DARK_OAK_LOG, (int) (1)).getItem())) {
											if ((Math.random() < 0.6)) {
												{
													TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
													if (_ent != null) {
														final int _sltid = (int) (1);
														final ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_LOG, (int) (1));
														_setstack.setCount((int) ((new Object() {
															public int getAmount(BlockPos pos, int sltid) {
																AtomicInteger _retval = new AtomicInteger(0);
																TileEntity _ent = world.getTileEntity(pos);
																if (_ent != null) {
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																			.ifPresent(capability -> {
																				_retval.set(capability.getStackInSlot(sltid).getCount());
																			});
																}
																return _retval.get();
															}
														}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																.ifPresent(capability -> {
																	if (capability instanceof IItemHandlerModifiable) {
																		((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
																	}
																});
													}
												}
												{
													TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
													int _amount = (int) 500;
													if (_ent != null)
														_ent.getCapability(CapabilityEnergy.ENERGY, null)
																.ifPresent(capability -> capability.extractEnergy(_amount, false));
												}
											}
										} else {
											if (((new Object() {
												public ItemStack getItemStack(BlockPos pos, int sltid) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													TileEntity _ent = world.getTileEntity(pos);
													if (_ent != null) {
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																.ifPresent(capability -> {
																	_retval.set(capability.getStackInSlot(sltid).copy());
																});
													}
													return _retval.get();
												}
											}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
													.getItem() == new ItemStack(Blocks.SAND, (int) (1)).getItem())) {
												if ((Math.random() < 0.6)) {
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (1);
															final ItemStack _setstack = new ItemStack(Blocks.SAND, (int) (1));
															_setstack.setCount((int) ((new Object() {
																public int getAmount(BlockPos pos, int sltid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	TileEntity _ent = world.getTileEntity(pos);
																	if (_ent != null) {
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																				.ifPresent(capability -> {
																					_retval.set(capability.getStackInSlot(sltid).getCount());
																				});
																	}
																	return _retval.get();
																}
															}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														int _amount = (int) 500;
														if (_ent != null)
															_ent.getCapability(CapabilityEnergy.ENERGY, null)
																	.ifPresent(capability -> capability.extractEnergy(_amount, false));
													}
												}
											} else {
												if (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														TileEntity _ent = world.getTileEntity(pos);
														if (_ent != null) {
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		_retval.set(capability.getStackInSlot(sltid).copy());
																	});
														}
														return _retval.get();
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
														.getItem() == new ItemStack(Blocks.GRAVEL, (int) (1)).getItem())) {
													if ((Math.random() < 0.6)) {
														{
															TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
															if (_ent != null) {
																final int _sltid = (int) (1);
																final ItemStack _setstack = new ItemStack(Blocks.GRAVEL, (int) (1));
																_setstack.setCount((int) ((new Object() {
																	public int getAmount(BlockPos pos, int sltid) {
																		AtomicInteger _retval = new AtomicInteger(0);
																		TileEntity _ent = world.getTileEntity(pos);
																		if (_ent != null) {
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						_retval.set(capability.getStackInSlot(sltid).getCount());
																					});
																		}
																		return _retval.get();
																	}
																}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																		.ifPresent(capability -> {
																			if (capability instanceof IItemHandlerModifiable) {
																				((IItemHandlerModifiable) capability).setStackInSlot(_sltid,
																						_setstack);
																			}
																		});
															}
														}
														{
															TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
															int _amount = (int) 500;
															if (_ent != null)
																_ent.getCapability(CapabilityEnergy.ENERGY, null)
																		.ifPresent(capability -> capability.extractEnergy(_amount, false));
														}
													}
												} else {
													if (((new Object() {
														public ItemStack getItemStack(BlockPos pos, int sltid) {
															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
															TileEntity _ent = world.getTileEntity(pos);
															if (_ent != null) {
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																		.ifPresent(capability -> {
																			_retval.set(capability.getStackInSlot(sltid).copy());
																		});
															}
															return _retval.get();
														}
													}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
															.getItem() == new ItemStack(Items.ENDER_PEARL, (int) (1)).getItem())) {
														if ((Math.random() < 0.35)) {
															{
																TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																if (_ent != null) {
																	final int _sltid = (int) (1);
																	final ItemStack _setstack = new ItemStack(Items.ENDER_PEARL, (int) (1));
																	_setstack.setCount((int) ((new Object() {
																		public int getAmount(BlockPos pos, int sltid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			TileEntity _ent = world.getTileEntity(pos);
																			if (_ent != null) {
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							_retval.set(capability.getStackInSlot(sltid).getCount());
																						});
																			}
																			return _retval.get();
																		}
																	}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																			.ifPresent(capability -> {
																				if (capability instanceof IItemHandlerModifiable) {
																					((IItemHandlerModifiable) capability).setStackInSlot(_sltid,
																							_setstack);
																				}
																			});
																}
															}
															{
																TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																int _amount = (int) 500;
																if (_ent != null)
																	_ent.getCapability(CapabilityEnergy.ENERGY, null)
																			.ifPresent(capability -> capability.extractEnergy(_amount, false));
															}
														}
													} else {
														if (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																TileEntity _ent = world.getTileEntity(pos);
																if (_ent != null) {
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																			.ifPresent(capability -> {
																				_retval.set(capability.getStackInSlot(sltid).copy());
																			});
																}
																return _retval.get();
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																.getItem() == new ItemStack(Items.CLAY_BALL, (int) (1)).getItem())) {
															if ((Math.random() < 0.6)) {
																{
																	TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																	if (_ent != null) {
																		final int _sltid = (int) (1);
																		final ItemStack _setstack = new ItemStack(Items.CLAY_BALL, (int) (1));
																		_setstack.setCount((int) ((new Object() {
																			public int getAmount(BlockPos pos, int sltid) {
																				AtomicInteger _retval = new AtomicInteger(0);
																				TileEntity _ent = world.getTileEntity(pos);
																				if (_ent != null) {
																					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																							null).ifPresent(capability -> {
																								_retval.set(
																										capability.getStackInSlot(sltid).getCount());
																							});
																				}
																				return _retval.get();
																			}
																		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																				.ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						((IItemHandlerModifiable) capability).setStackInSlot(_sltid,
																								_setstack);
																					}
																				});
																	}
																}
																{
																	TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																	int _amount = (int) 500;
																	if (_ent != null)
																		_ent.getCapability(CapabilityEnergy.ENERGY, null)
																				.ifPresent(capability -> capability.extractEnergy(_amount, false));
																}
															}
														} else {
															if (((new Object() {
																public ItemStack getItemStack(BlockPos pos, int sltid) {
																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																	TileEntity _ent = world.getTileEntity(pos);
																	if (_ent != null) {
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																				.ifPresent(capability -> {
																					_retval.set(capability.getStackInSlot(sltid).copy());
																				});
																	}
																	return _retval.get();
																}
															}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																	.getItem() == new ItemStack(Blocks.NETHERRACK, (int) (1)).getItem())) {
																if ((Math.random() < 0.6)) {
																	{
																		TileEntity _ent = world
																				.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																		if (_ent != null) {
																			final int _sltid = (int) (1);
																			final ItemStack _setstack = new ItemStack(Blocks.NETHERRACK, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
																	}
																	{
																		TileEntity _ent = world
																				.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																		int _amount = (int) 500;
																		if (_ent != null)
																			_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																					capability -> capability.extractEnergy(_amount, false));
																	}
																}
															} else {
																if (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																		TileEntity _ent = world.getTileEntity(pos);
																		if (_ent != null) {
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						_retval.set(capability.getStackInSlot(sltid).copy());
																					});
																		}
																		return _retval.get();
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																		.getItem() == new ItemStack(Items.QUARTZ, (int) (1)).getItem())) {
																	if ((Math.random() < 0.7)) {
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (1);
																				final ItemStack _setstack = new ItemStack(Items.QUARTZ, (int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
																						+ 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 500;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																	}
																} else {
																	if (((new Object() {
																		public ItemStack getItemStack(BlockPos pos, int sltid) {
																			AtomicReference<ItemStack> _retval = new AtomicReference<>(
																					ItemStack.EMPTY);
																			TileEntity _ent = world.getTileEntity(pos);
																			if (_ent != null) {
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							_retval.set(capability.getStackInSlot(sltid).copy());
																						});
																			}
																			return _retval.get();
																		}
																	}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
																			.getItem() == new ItemStack(Items.GLOWSTONE_DUST, (int) (1)).getItem())) {
																		if ((Math.random() < 0.4)) {
																			{
																				TileEntity _ent = world
																						.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																				if (_ent != null) {
																					final int _sltid = (int) (1);
																					final ItemStack _setstack = new ItemStack(Items.GLOWSTONE_DUST,
																							(int) (1));
																					_setstack.setCount((int) ((new Object() {
																						public int getAmount(BlockPos pos, int sltid) {
																							AtomicInteger _retval = new AtomicInteger(0);
																							TileEntity _ent = world.getTileEntity(pos);
																							if (_ent != null) {
																								_ent.getCapability(
																										CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																										null).ifPresent(capability -> {
																											_retval.set(
																													capability.getStackInSlot(sltid)
																															.getCount());
																										});
																							}
																							return _retval.get();
																						}
																					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
																							+ 1));
																					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																							null).ifPresent(capability -> {
																								if (capability instanceof IItemHandlerModifiable) {
																									((IItemHandlerModifiable) capability)
																											.setStackInSlot(_sltid, _setstack);
																								}
																							});
																				}
																			}
																			{
																				TileEntity _ent = world
																						.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																				int _amount = (int) 500;
																				if (_ent != null)
																					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																							capability -> capability.extractEnergy(_amount, false));
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
