package cursedbread.plushies.blocks.meta;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class SpinMeRighRound extends MetaStateInterpreter {

	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		int hRotation = meta & 3;
		HashMap<String, String> result = new HashMap<>();
		result.put("facing", new String[]{"east", "west", "south", "north"}[hRotation]);
		return result;
	}
}

