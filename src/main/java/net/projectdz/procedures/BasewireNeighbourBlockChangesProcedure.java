package net.projectdz.procedures;

import net.projectdz.block.Basewirecon6Block;
import net.projectdz.block.Basewirecon5upBlock;
import net.projectdz.block.Basewirecon5mainBlock;
import net.projectdz.block.Basewirecon5downBlock;
import net.projectdz.block.Basewirecon4upanddownstraightBlock;
import net.projectdz.block.Basewirecon4upanddownBlock;
import net.projectdz.block.Basewirecon4upBlock;
import net.projectdz.block.Basewirecon4downBlock;
import net.projectdz.block.Basewirecon4Block;
import net.projectdz.block.Basewirecon3upangleBlock;
import net.projectdz.block.Basewirecon3upBlock;
import net.projectdz.block.Basewirecon3downangleBlock;
import net.projectdz.block.Basewirecon3downandupBlock;
import net.projectdz.block.Basewirecon3downBlock;
import net.projectdz.block.Basewirecon3Block;
import net.projectdz.block.Basewirecon2angleupBlock;
import net.projectdz.block.Basewirecon2angledownBlock;
import net.projectdz.block.Basewirecon2angleBlock;
import net.projectdz.block.Basewirecon2Block;
import net.projectdz.block.Basewirecon1Block;
import net.projectdz.block.BasewireBlock;
import net.projectdz.ProjecdzModElements;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.IProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.block.BlockState;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

@ProjecdzModElements.ModElement.Tag
public class BasewireNeighbourBlockChangesProcedure extends ProjecdzModElements.ModElement {
	public BasewireNeighbourBlockChangesProcedure(ProjecdzModElements instance) {
		super(instance, 245);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure BasewireNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure BasewireNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure BasewireNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure BasewireNeighbourBlockChanges!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double number_of_con = 0;
		number_of_con = (double) 0;
		if ((new Object() {
			public boolean canReceiveEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z)))) {
			number_of_con = (double) ((number_of_con) + 1);
		}
		if ((new Object() {
			public boolean canReceiveEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) {
			number_of_con = (double) ((number_of_con) + 1);
		}
		if ((new Object() {
			public boolean canReceiveEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
			number_of_con = (double) ((number_of_con) + 1);
		}
		if ((new Object() {
			public boolean canReceiveEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))) {
			number_of_con = (double) ((number_of_con) + 1);
		}
		if ((new Object() {
			public boolean canReceiveEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) {
			number_of_con = (double) ((number_of_con) + 1);
		}
		if ((new Object() {
			public boolean canReceiveEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1))))) {
			number_of_con = (double) ((number_of_con) + 1);
		}
		if (((number_of_con) == 0)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = BasewireBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_bs.has(_property))
						_bs = _bs.with(_property, (Comparable) entry.getValue());
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
		if (((number_of_con) == 1)) {
			if ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon1Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon1Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z)))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon1Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon1Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon1Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.UP), 3);
				} catch (Exception e) {
				}
			}
			if ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon1Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.DOWN), 3);
				} catch (Exception e) {
				}
			}
		}
		if (((number_of_con) == 2)) {
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.DOWN), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angledownBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angledownBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angledownBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angledownBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angleupBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angleupBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angleupBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon2angleupBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
		}
		if (((number_of_con) == 3)) {
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1))))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downangleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downangleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downangleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downangleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3upangleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3upangleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3upangleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3upangleBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downandupBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downandupBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downandupBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if (((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon3downandupBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
		}
		if (((number_of_con) == 4)) {
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
		}
		if (((number_of_con) == 4)) {
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upanddownBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upanddownBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upanddownBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upanddownBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upanddownstraightBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon4upanddownstraightBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
		}
		if (((number_of_con) == 5)) {
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon5downBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon5upBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon5mainBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.EAST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z)))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon5mainBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon5mainBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.SOUTH), 3);
				} catch (Exception e) {
				}
			}
			if ((((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))))) && ((new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && (new Object() {
				public boolean canReceiveEnergy(BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(new BlockPos((int) x, (int) y, (int) (z + 1))))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Basewirecon5mainBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
				} catch (Exception e) {
				}
			}
		}
		if (((number_of_con) == 6)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = Basewirecon6Block.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_bs.has(_property))
						_bs = _bs.with(_property, (Comparable) entry.getValue());
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
	}
}
