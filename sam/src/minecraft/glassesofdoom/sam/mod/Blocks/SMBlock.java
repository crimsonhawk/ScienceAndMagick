package glassesofdoom.sam.mod.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import glassesofdoom.sam.mod.lib.BlockIds;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.block.Block;

public class SMBlock {
	
	public static Block Forge;
	public static Block Adamantium;
	public static Block Rune;
	public static Block Aetherium;
	public static Block Limestone;
	public static Block Orichalcum;
	public static Block Marble;
	public static Block Granite;
	public static Block Magnesium;
	public static Block Wonderflonium;
	public static Block Mithril;
	public static Block Silicon;
	public static Block Tin;
	public static Block	Copper;
	public static Block Titanium;
	public static Block Silver;
	public static Block OpalBlock;
	public static Block StarSteel;
	public static Block BloodCobbleStone;
	public static Block BloodSmoothStone;
	public static Block BloodLogs;
	public static Block BloodLeaves;
	public static Block BloodPlanks;
	public static Block SiliconLogs;
	public static Block SiliconLeaves;
	public static Block SiliconPlanks;
	
	
	public static void init() {

		//Forge = new BlockForge(BlockIds.FORGE);
		Adamantium = new BlockAdamantium(BlockIds.ADAMANTIUM);
		Rune = new BlockRune(BlockIds.RUNE);
		Aetherium = new BlockAetherium(BlockIds.AETHERIUM);
		Limestone = new BlockLimestone(BlockIds.LIMESTONE);
		Orichalcum = new BlockOrichalcum(BlockIds.ORICHALCUM);
		Marble = new BlockMarble(BlockIds.MARBLE);
		Granite = new BlockGranite(BlockIds.GRANITE);
		Magnesium = new BlockMagnesium(BlockIds.MAGNESIUM);
		Wonderflonium = new BlockWonderflonium(BlockIds.WONDERFLONIUM);
		Mithril = new BlockMithril(BlockIds.MITHRIL);
		Silicon = new BlockSilicon(BlockIds.SILICON);
		Tin = new BlockTin(BlockIds.TIN);
		Copper = new BlockCopper(BlockIds.COPPER);
		Titanium = new BlockTitanium(BlockIds.TITANIUM);
		Silver = new BlockSilver(BlockIds.SILVER);
		OpalBlock = new BlockOpalBlock(BlockIds.OPALBLOCK);
		StarSteel = new BlockStarSteel(BlockIds.STARSTEEL);
		BloodCobbleStone = new BlockBloodCobbleStone(BlockIds.BLOODCOBBLESTONE);
		BloodSmoothStone = new BlockBloodSmoothStone(BlockIds.BLOODSMOOTHSTONE);
		BloodLogs = new BlockBloodLogs(BlockIds.BLOODLOGS);
		//BloodLeaves = new BlockBloodLeaves(BlockIds.BLOODLEAVES);
		BloodPlanks = new BlockBloodPlanks(BlockIds.BLOODPLANKS);
		SiliconLogs = new BlockSiliconLogs(BlockIds.SILICONLOGS);
		SiliconLeaves = new BlockSiliconLeaves(BlockIds.SILICONLEAVES);
		SiliconPlanks = new SiliconPlanks(BlockIds.SILICONPLANKS);
		
		
		//GameRegistry.registerBlock(Forge, Strings.Block_Forge_Name);
		GameRegistry.registerBlock(Adamantium, Strings.Block_Adamantium_Name);
		GameRegistry.registerBlock(Rune, Strings.Block_Rune_Name);
		GameRegistry.registerBlock(Aetherium, Strings.Block_Aetherium_Name);
		GameRegistry.registerBlock(Limestone, Strings.Block_Limestone_Name);
		GameRegistry.registerBlock(Orichalcum, Strings.Block_Orichalcum_Name);
		GameRegistry.registerBlock(Marble, Strings.Block_Marble_Name);	
		GameRegistry.registerBlock(Granite, Strings.Block_Granit_Name);
		GameRegistry.registerBlock(Magnesium, Strings.Block_Magnesium_Name);
		GameRegistry.registerBlock(Wonderflonium, Strings.Block_Wonderflonium_Name);
		GameRegistry.registerBlock(Mithril, Strings.Block_Mithril_Name);
		GameRegistry.registerBlock(Silicon, Strings.Block_Silicon_Name);
		GameRegistry.registerBlock(Tin, Strings.Block_Tin_Name);
		GameRegistry.registerBlock(Copper, Strings.Block_Copper_Name);
		GameRegistry.registerBlock(Titanium, Strings.Block_Titanium_Name);
		GameRegistry.registerBlock(Silver, Strings.Block_Silver_Name);
		GameRegistry.registerBlock(OpalBlock, Strings.Block_Opal_Name);
		GameRegistry.registerBlock(StarSteel, Strings.Block_Star_Steel_Name);
		GameRegistry.registerBlock(BloodCobbleStone, Strings.Block_Blood_Cobblestone_Name);
		GameRegistry.registerBlock(BloodSmoothStone, Strings.Block_Blood_Smoothstone_Name);
		GameRegistry.registerBlock(BloodLogs, Strings.Block_Blood_Logs_Name);
		//GameRegistry.registerBlock(BloodLeaves, Strings.Block_Blood_Leaves_Name);
		GameRegistry.registerBlock(BloodPlanks, Strings.Block_Blood_Planks_Name);
		GameRegistry.registerBlock(SiliconLogs, Strings.Block_Silicon_Logs_Name);
		GameRegistry.registerBlock(SiliconLeaves, Strings.Block_Blood_Leaves_Name);
 		GameRegistry.registerBlock(SiliconPlanks, Strings.Block_Silicon_Planks_Name);
 		
 		
 		
 		//LanguageRegistry.addName(Forge, Strings.Block_Forge_Name);
 		LanguageRegistry.addName(Adamantium, Strings.Block_Adamantium_Name);
 		LanguageRegistry.addName(Rune, Strings.Block_Rune_Name);
 		LanguageRegistry.addName(Aetherium, Strings.Block_Aetherium_Name);
 		LanguageRegistry.addName(Limestone, Strings.Block_Limestone_Name);
 		LanguageRegistry.addName(Orichalcum, Strings.Block_Orichalcum_Name);
 		LanguageRegistry.addName(Marble, Strings.Block_Marble_Name);
 		LanguageRegistry.addName(Granite, Strings.Block_Granit_Name);
 		LanguageRegistry.addName(Magnesium, Strings.Block_Magnesium_Name);
 		LanguageRegistry.addName(Wonderflonium, Strings.Block_Wonderflonium_Name);
 		LanguageRegistry.addName(Mithril, Strings.Block_Mithril_Name);
 		LanguageRegistry.addName(Silicon, Strings.Block_Silicon_Name);
 		LanguageRegistry.addName(Tin, Strings.Block_Tin_Name);
 		LanguageRegistry.addName(Copper, Strings.Block_Copper_Name);
 		LanguageRegistry.addName(Titanium, Strings.Block_Titanium_Name);
 		LanguageRegistry.addName(Silver, Strings.Block_Silver_Name);
 		LanguageRegistry.addName(OpalBlock, Strings.Block_Opal_Name);
 		LanguageRegistry.addName(StarSteel, Strings.Block_Star_Steel_Name);
 		LanguageRegistry.addName(BloodCobbleStone, Strings.Block_Blood_Cobblestone_Name);
 		LanguageRegistry.addName(BloodSmoothStone, Strings.Block_Blood_Smoothstone_Name);
 		LanguageRegistry.addName(BloodLogs, Strings.Block_Blood_Logs_Name);
 		//LanguageRegistry.addName(BloodLeaves, Strings.Block_Blood_Leaves_Name);
 		LanguageRegistry.addName(BloodPlanks, Strings.Block_Blood_Planks_Name);
 		LanguageRegistry.addName(SiliconLogs, Strings.Block_Silicon_Logs_Name);
 		LanguageRegistry.addName(SiliconLeaves, Strings.Block_Silicon_Leaves_Name);
 		LanguageRegistry.addName(SiliconPlanks, Strings.Block_Silicon_Planks_Name);
		

	}



}
