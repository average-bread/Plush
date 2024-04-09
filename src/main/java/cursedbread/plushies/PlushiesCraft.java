package cursedbread.plushies;

import cursedbread.plushies.blocks.Plushie;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class PlushiesCraft implements RecipeEntrypoint {
	public static final String MOD_ID = "examplemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	int colors;

	@Override
	public void initNamespaces() {

	}
	@Override
	public void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.featherChicken)
			.addInput('W', "minecraft:wools")
			.create("chickenCraft", new ItemStack(PlushiesMod.chickenPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.bucketMilk)
			.addInput('W', "minecraft:wools")
			.create("cowCraft", new ItemStack(PlushiesMod.cowPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.sulphur)
			.addInput('W', "minecraft:wools")
			.create("creeperCraft", new ItemStack(PlushiesMod.creeperPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("NHN", "HWH", "NHN")
			.addInput('H', Item.sulphur)
			.addInput('N', Item.nethercoal)
			.addInput('W', "minecraft:wools")
			.create("ghastCraft", new ItemStack(PlushiesMod.ghastPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.foodPorkchopRaw)
			.addInput('W', "minecraft:wools")
			.create("pigCraft", new ItemStack(PlushiesMod.pigPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH", "HHH")
			.addInput('H', "minecraft:wools")
			.create("sheepCraft", new ItemStack(PlushiesMod.sheep15Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 0)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep0Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 1)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep1Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 2)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep2Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 3)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep3Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 4)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep4Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 5)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep5Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 6)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep6Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 7)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep7Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 8)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep8Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 9)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep9Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 10)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep10Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 11)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep11Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 12)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep12Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 13)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep13Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 14)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep14Plushie, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("plushies:sheep")
			.addInput(Item.dye, 15)
			.create("itemGroupExample", new ItemStack(PlushiesMod.sheep15Plushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.bone)
			.addInput('W', "minecraft:wools")
			.create("slimeCraft", new ItemStack(PlushiesMod.skeletonPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.slimeball)
			.addInput('W', "minecraft:wools")
			.create("slimeCraft", new ItemStack(PlushiesMod.slimePlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.string)
			.addInput('W', "minecraft:wools")
			.create("slimeCraft", new ItemStack(PlushiesMod.spiderPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.dye, 0)
			.addInput('W', "minecraft:wools")
			.create("slimeCraft", new ItemStack(PlushiesMod.squidPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("NHN", "HWH", "NHN")
			.addInput('H', Item.foodPorkchopRaw)
			.addInput('N', Item.bone)
			.addInput('W', "minecraft:wools")
			.create("ghastCraft", new ItemStack(PlushiesMod.wolfPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.cloth)
			.addInput('W', "minecraft:wools")
			.create("slimeCraft", new ItemStack(PlushiesMod.zombiePlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("NNN", "NWN", "NNN")
			.addInput('N', Block.sand)
			.addInput('W', PlushiesMod.spiderPlushie)
			.create("ghastCraft", new ItemStack(PlushiesMod.scorpionPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("NNN", "NWN", "NNN")
			.addInput('N', Item.ammoSnowball)
			.addInput('W', PlushiesMod.zombiePlushie)
			.create("ghastCraft", new ItemStack(PlushiesMod.snowmanPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("NHN", "HWH", "NHN")
			.addInput('H', Item.nethercoal)
			.addInput('N', Item.foodPorkchopRaw)
			.addInput('W', "minecraft:wools")
			.create("ghastCraft", new ItemStack(PlushiesMod.zombiepigmanPlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("NNN", "NWN", "NNN")
			.addInput('N', Item.chainlink)
			.addInput('W', PlushiesMod.zombiePlushie)
			.create("ghastCraft", new ItemStack(PlushiesMod.armoredzombiePlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HWH", "HHH")
			.addInput('H', Item.foodApple)
			.addInput('W', "minecraft:wools")
			.create("slimeCraft", new ItemStack(PlushiesMod.playerstevePlushie, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH", "HHH")
			.addInput('H', PlushiesMod.zombiePlushie)
			.create("slimeCraft", new ItemStack(PlushiesMod.zombiegiantPlushie, 1));
	}
}

