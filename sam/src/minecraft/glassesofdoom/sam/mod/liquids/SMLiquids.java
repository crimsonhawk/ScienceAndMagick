package glassesofdoom.sam.mod.liquids;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import glassesofdoom.sam.mod.lib.LiquidIds;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;

public class SMLiquids {
	
	public static Block RedWaterStill;
	public static Block YellowWaterStill;
	public static Block OrangeWaterStill;
	public static Block GreenWaterStill;
	public static Block BlueWaterStill;
	public static Block PurpleWaterStill;
	public static Block PinkWaterStill;
	public static Block SilverWaterStill;
	public static Block LuminusWaterStill;
	public static Block HeavyWaterStill;
	public static Block ChunkyWaterStill;
	
	public static Block RedWaterFlowing;
	public static Block YellowWaterFlowing;
	public static Block OrangeWaterFlowing;
	public static Block GreenWaterFlowing;
	public static Block BlueWaterFlowing;
	public static Block PurpleWaterFlowing;
	public static Block PinkWaterFlowing;
	public static Block SilverWaterFlowing;
	public static Block LuminusWaterFlowing;
	public static Block HeavyWaterFlowing;
	public static Block ChunkyWaterFlowing;
	
	public static Item RedWaterBucket;
	public static Item YellowWaterBucket;
	public static Item OrangeWaterBucket;
	public static Item GreenWaterBucket;
	public static Item BlueWaterBucket;
	public static Item PurpleWaterBucket;
	public static Item PinkWaterBucket;
	public static Item SilverWaterBucket;
	public static Item LuminusWaterBucket;
	public static Item HeavyWaterBucket;
	public static Item ChunkyWaterBucket;
	
	public static void init() {

		RedWaterStill = new BlockRedWaterStill(LiquidIds.REDWATERSTILL).setBlockName(Strings.Water_Red_Still_Name);
		
		GameRegistry.registerBlock(RedWaterStill, Strings.Water_Red_Still_Name);
		LanguageRegistry.addName(RedWaterStill, Strings.Water_Red_Still_Name);
		
		
		
	}
	

}
