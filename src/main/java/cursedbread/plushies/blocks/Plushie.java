package cursedbread.plushies.blocks;

import cursedbread.plushies.PlushiesMod;
import net.minecraft.core.block.BlockRotatableHorizontal;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class Plushie extends BlockRotatableHorizontal {
	public Plushie(String key, int id, Material material) {
		super(key, id, material);
		this.setBlockBounds(0.25f, 0, 0.25f, 0.75f, 0.5f, 0.75f);
	}
	public boolean renderAsNormalBlock() {
		return false;
	}
	@Override
	public boolean isSolidRender() {
		return false;
	}

	@Override
	public boolean canPlaceOnSurface() {
		return true;
	}
	@Override
	public int getRenderBlockPass() {
		return 1;
	}

	public void onBlockAdded(World world, int x, int y, int z) {
		world.isBlockNormalCube(x, y - 1, z);
	}

	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		return world.isBlockNormalCube(x, y - 1, z) || world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
	}


}

