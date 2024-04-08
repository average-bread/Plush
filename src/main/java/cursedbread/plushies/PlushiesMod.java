package cursedbread.plushies;

import cursedbread.plushies.blocks.Plushie;
import cursedbread.plushies.blocks.meta.SpinMeRighRound;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

import java.util.Properties;


public class PlushiesMod implements ModInitializer, GameStartEntrypoint {
	public static final String MOD_ID = "plushies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static BlockBuilder plushies = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.CLOTH)
		.setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.PLANTABLE_IN_JAR)
		.setHardness(0.5f);

	public static int blockId;
	int textures;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id", "2000");
		ConfigHandler config = new ConfigHandler(MOD_ID, prop);

		blockId = config.getInt("starting_block_id");

		config.updateConfig();
	}

	public static Block chickenPlushie;
	public static Block cowPlushie;
	public static Block creeperPlushie;
	public static Block ghastPlushie;
	public static Block pigPlushie;
	public static Block sheep0Plushie;
	public static Block sheep1Plushie;
	public static Block sheep2Plushie;
	public static Block sheep3Plushie;
	public static Block sheep4Plushie;
	public static Block sheep5Plushie;
	public static Block sheep6Plushie;
	public static Block sheep7Plushie;
	public static Block sheep8Plushie;
	public static Block sheep9Plushie;
	public static Block sheep10Plushie;
	public static Block sheep11Plushie;
	public static Block sheep12Plushie;
	public static Block sheep13Plushie;
	public static Block sheep14Plushie;
	public static Block sheep15Plushie;
	public static Block skeletonPlushie;
	public static Block slimePlushie;
	public static Block spiderPlushie;
	public static Block squidPlushie;
	public static Block wolfPlushie;
	public static Block zombiePlushie;
	public static Block scorpionPlushie;
	public static Block snowmanPlushie;
	public static Block zombiepigmanPlushie;
	public static Block armoredzombiePlushie;
	public static Block playerstevePlushie;
	public static Block playerblankPlushie;
	public static Block playeruselessPlushie;
	public static Block zombiegiantPlushie;
	@Override
	public void onInitialize() {
		LOGGER.info("Plushies mod");
	}

	@Override
	public void beforeGameStart() {
		// I use the same mob order as Spawn Eggs mod so 1.Chicken
		chickenPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/chicken_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "chicken_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("chickenPlushie", blockId++, Material.cloth));
		// 2.Cow
		cowPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/cow_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "cow_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("cowPlushie", blockId++, Material.cloth));
		// 3.Creeper
		creeperPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/creeper_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "creeper_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("creeperPlushie", blockId++, Material.cloth));
		// 4.Ghast
		ghastPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/ghast_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "ghast_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("ghastPlushie", blockId++, Material.cloth));
		// 5.Pig
		pigPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/pig_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "pig_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("pigPlushie", blockId++, Material.cloth));
		// 6.Sheep (Hope I will update it and make it better, but for now it's like this)
		sheep0Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_0_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_0_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep0Plushie", blockId++, Material.cloth));
		sheep1Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_1_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_1_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep1Plushie", blockId++, Material.cloth));
		sheep2Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_2_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_2_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep2Plushie", blockId++, Material.cloth));
		sheep3Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_3_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_3_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep3Plushie", blockId++, Material.cloth));
		sheep4Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_4_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_4_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep4Plushie", blockId++, Material.cloth));
		sheep5Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_5_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_5_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep5Plushie", blockId++, Material.cloth));
		sheep6Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_6_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_6_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep6Plushie", blockId++, Material.cloth));
		sheep7Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_7_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_7_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep7Plushie", blockId++, Material.cloth));
		sheep8Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_8_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_8_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep8Plushie", blockId++, Material.cloth));
		sheep9Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_9_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_9_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep9Plushie", blockId++, Material.cloth));
		sheep10Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_10_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_10_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep10Plushie", blockId++, Material.cloth));
		sheep11Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_11_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_11_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep11Plushie", blockId++, Material.cloth));
		sheep12Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_12_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_12_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep12Plushie", blockId++, Material.cloth));
		sheep13Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_13_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_13_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep13Plushie", blockId++, Material.cloth));
		sheep14Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_14_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_14_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep14Plushie", blockId++, Material.cloth));
		sheep15Plushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/sheep/sheep_15_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "sheep/sheep_15_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("sheep15Plushie", blockId++, Material.cloth));
		// 7.Skeleton
		skeletonPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/skeleton_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "skeleton_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("skeletonPlushie", blockId++, Material.cloth));
		// 8.Slime
		slimePlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/slime_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "slime_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("slimePlushie", blockId++, Material.cloth));
		// 9.Spider
		spiderPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/spider_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "spider_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("spiderPlushie", blockId++, Material.cloth));
		// 10.Squid
		squidPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/squid_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "squid_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("squidPlushie", blockId++, Material.cloth));
		// 11.Squid
		wolfPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/wolf_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "wolf_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("wolfPlushie", blockId++, Material.cloth));
		// 12.Zombie
		zombiePlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/zombie_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "zombie_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("zombiePlushie", blockId++, Material.cloth));
		// 13.Scorpion
		scorpionPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/scorpion_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "scorpion_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("scorpionPlushie", blockId++, Material.cloth));
		// 14.Snowman
		snowmanPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/snowman_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "snowman_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("snowmanPlushie", blockId++, Material.cloth));
		// 15.Zombie Pigman
		zombiepigmanPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/zombie_pigman_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "zombie_pigman_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("zombiepigmanPlushie", blockId++, Material.cloth));
		// 16.Armored Zombie
		armoredzombiePlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/armored_zombie_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "armored_zombie_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("armoredzombiePlushie", blockId++, Material.cloth));
		// 17.Player
		playerstevePlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/player/player_steve_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "player/player_steve_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("playerstevePlushie", blockId++, Material.cloth));
		playerblankPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/player/player_blank_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "player/player_blank_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("playerblankPlushie", blockId++, Material.cloth));
		playeruselessPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/player/player_useless_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "player/player_useless_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("playeruselessPlushie", blockId++, Material.cloth));
		// 18.Giant Zombie
		zombiegiantPlushie = plushies
			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/zombie_giant_plushie.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "zombie_giant_plushie.json"), new SpinMeRighRound(), true))
			.build(new Plushie("zombiegiantPlushie", blockId++, Material.cloth));
	}

	@Override
	public void afterGameStart() {

	}
}
