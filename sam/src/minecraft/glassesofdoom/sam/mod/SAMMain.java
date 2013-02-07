package glassesofdoom.sam.mod;

import com.google.common.base.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import glassesofdoom.sam.mod.Blocks.SMBlock;
import glassesofdoom.sam.mod.CreativeTabs.CreativeTabsSAM;
import glassesofdoom.sam.mod.CreativeTabs.CreativeTabsSAMItems;
import glassesofdoom.sam.mod.Items.SMItem;
import glassesofdoom.sam.mod.core.proxys.CommonProxy;
import glassesofdoom.sam.mod.lib.BlockIds;
import glassesofdoom.sam.mod.lib.ItemIds;
import glassesofdoom.sam.mod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
 
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.Version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SAMMain {
	
	
	@Instance(Reference.MOD_ID)
	public static SAMMain instance;
	
	@SidedProxy(clientSide = Reference.ClientProxy  , serverSide = Reference.CommonProxy)
	public static CommonProxy proxy;
	
	public static CreativeTabs TabsSam = new CreativeTabsSAM("S&M Blocks");
	public static CreativeTabs TabsSamItems = new CreativeTabsSAMItems("S&M Items");
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		/*Blocks*/
		//FORGE = config.getBlock(Configuration.CATEGORY_BLOCK, "Forge", BlockIds.FORGE_DEFAULT).getInt();
		BlockIds.ADAMANTIUM = config.getBlock(Configuration.CATEGORY_BLOCK, "Adamantium" , BlockIds.ADAMANTIUM_DEFAULT).getInt();
		BlockIds.RUNE = config.getBlock(Configuration.CATEGORY_BLOCK, "Rune", BlockIds.RUNE_DEFAULT).getInt();
		BlockIds.AETHERIUM = config.getBlock(Configuration.CATEGORY_BLOCK, "Aetherium", BlockIds.AETHERIUM_DEFAULT).getInt();
		BlockIds.LIMESTONE = config.getBlock(Configuration.CATEGORY_BLOCK, "Limestone", BlockIds.LIMESTONE_DEFAULT).getInt();
		BlockIds.ORICHALCUM = config.getBlock(Configuration.CATEGORY_BLOCK, "Orichalcum", BlockIds.ORICHALCUM_DEFAULT).getInt();
		BlockIds.MARBLE = config.getBlock(Configuration.CATEGORY_BLOCK, "Marble", BlockIds.MARBLE_DEFAULT).getInt();
		BlockIds.GRANITE = config.getBlock(Configuration.CATEGORY_BLOCK, "Granite", BlockIds.GRANITE_DEFAULT).getInt();
		BlockIds.MAGNESIUM = config.getBlock(Configuration.CATEGORY_BLOCK, "Magnesium", BlockIds.MAGNESIUM_DEFAULT).getInt();
		BlockIds.WONDERFLONIUM = config.getBlock(Configuration.CATEGORY_BLOCK, "Wonderflonium", BlockIds.WONDERFLONIUM_DEFAULT).getInt();
		BlockIds.MITHRIL = config.getBlock(Configuration.CATEGORY_BLOCK, "Mithril", BlockIds.MITHRIL_DEFAULT).getInt();
		BlockIds.SILICON = config.getBlock(Configuration.CATEGORY_BLOCK, "Silicon", BlockIds.SILICON_DEFAULT).getInt();
		BlockIds.TIN = config.getBlock(Configuration.CATEGORY_BLOCK, "Tin", BlockIds.TIN_DEFAULT).getInt();
		BlockIds.COPPER = config.getBlock(Configuration.CATEGORY_BLOCK, "Copper", BlockIds.COPPER_DEFAULT).getInt();
		BlockIds.TITANIUM = config.getBlock(Configuration.CATEGORY_BLOCK, "Titanium", BlockIds.TITANIUM_DEFAULT).getInt();
		BlockIds.SILVER = config.getBlock(Configuration.CATEGORY_BLOCK, "Silver", BlockIds.SILVER_DEFAULT).getInt();
		BlockIds.OPALBLOCK = config.getBlock(Configuration.CATEGORY_BLOCK, "OpalBlock", BlockIds.OPALBLOCK_DEFALT).getInt();
		BlockIds.STARSTEEL = config.getBlock(Configuration.CATEGORY_BLOCK, "StarSteel", BlockIds.STARSTEEL_DEFAULT).getInt();
		BlockIds.BLOODCOBBLESTONE = config.getBlock(Configuration.CATEGORY_BLOCK, "BloodCobbleStone", BlockIds.BLOODCOBBLESTONE_DEFAULT).getInt();
		BlockIds.BLOODSMOOTHSTONE = config.getBlock(Configuration.CATEGORY_BLOCK, "BloodSmoothStone", BlockIds.BLOODSMOOTHSTONE_DEFAULT).getInt();
		BlockIds.BLOODLOGS = config.getBlock(Configuration.CATEGORY_BLOCK, "BloodLogs", BlockIds.BLOODLOGS_DEFAULT).getInt();
		BlockIds.BLOODLEAVES = config.getBlock(Configuration.CATEGORY_BLOCK, "BloodLeaves", BlockIds.BLOODLEAVES_DEFAULT).getInt();
		BlockIds.BLOODPLANKS = config.getBlock(Configuration.CATEGORY_BLOCK, "BloodPlanks", BlockIds.BLOODPLANKS_DEFAULT).getInt();
		BlockIds.SILICONLOGS = config.getBlock(Configuration.CATEGORY_BLOCK, "SiliconLogs", BlockIds.SILICONLOGS_DEFAULT).getInt();
		BlockIds.SILICONLEAVES = config.getBlock(Configuration.CATEGORY_BLOCK, "SiliconLeaves", BlockIds.SILICONLEAVES_DEFAULT).getInt();
		BlockIds.SILICONPLANKS = config.getBlock(Configuration.CATEGORY_BLOCK, "SiliconPlanks", BlockIds.SILICONPLANKS_DEFAULT).getInt();
		
		/*Items*/
		ItemIds.MAMACRYSTLE = config.getItem(Configuration.CATEGORY_ITEM, "ManaCrystle", ItemIds.MAMACRYSTLE_DEFAULT).getInt();
		ItemIds.MANAINGOT = config.getItem(Configuration.CATEGORY_ITEM, "ManaIngot", ItemIds.MANAINGOT_DEFAULT).getInt();
		ItemIds.RUNEINGOT = config.getItem(Configuration.CATEGORY_ITEM, "RuneIngot", ItemIds.RUNEINGOT_DEFAULT).getInt();
		ItemIds.ADAMANTIUMINGOT = config.getItem(Configuration.CATEGORY_ITEM, "AdamatiumIngot", ItemIds.ADAMANTIUMINGOT_DEFAULT).getInt();
		ItemIds.AETHERIUMCRYSTLE = config.getItem(Configuration.CATEGORY_ITEM, "AetheriumIngot", ItemIds.AETHERIUMCRYSTLE_DEFAULT).getInt();
		ItemIds.ORICHALCUMINGOT = config.getItem(Configuration.CATEGORY_ITEM, "OrichalcumIngot", ItemIds.ORICHALCUMINGOT_DEFAULT).getInt();
		ItemIds.WONDERFLONIUMINGOT = config.getItem(Configuration.CATEGORY_ITEM, "WonderfloniumIngot", ItemIds.MAMACRYSTLE_DEFAULT).getInt();
		ItemIds.MITHRILINGOT = config.getItem(Configuration.CATEGORY_ITEM, "MithrilIngot", ItemIds.MITHRILINGOT_DEFAULT).getInt();
		ItemIds.SILICONINGOT = config.getItem(Configuration.CATEGORY_ITEM, "SiliconIngot", ItemIds.SILICONINGOT_DEFAULT).getInt();
		ItemIds.TININGOT = config.getItem(Configuration.CATEGORY_ITEM, "TinIngot", ItemIds.TININGOT_DEFAULT).getInt();
		ItemIds.COPPERINGOT = config.getItem(Configuration.CATEGORY_ITEM, "CopperIngot", ItemIds.COPPERINGOT_DEFAULT).getInt();
		ItemIds.BRONZEINGOT = config.getItem(Configuration.CATEGORY_ITEM, "BronzeIngot", ItemIds.BRONZEINGOT_DEFAULT).getInt();
		ItemIds.TITANIUMINGOT = config.getItem(Configuration.CATEGORY_ITEM, "TitaniumIngot", ItemIds.TITANIUMINGOT_DEFAULT).getInt();
		ItemIds.SILVERINGOT = config.getItem(Configuration.CATEGORY_ITEM, "SilverIngot", ItemIds.SILVERINGOT_DEFAULT).getInt();
		ItemIds.STEELINGOT = config.getItem(Configuration.CATEGORY_ITEM, "SteelIngot", ItemIds.STEELINGOT_DEFAULT).getInt();
		ItemIds.STARSTEELINGOT = config.getItem(Configuration.CATEGORY_ITEM, "StarSteelIngot", ItemIds.STARSTEELINGOT_DEFAULT).getInt();
		ItemIds.INGOTMOLD = config.getItem(Configuration.CATEGORY_ITEM, "IngotMold", ItemIds.INGOTMOLD_DEFAULT).getInt();
		ItemIds.PICKAXEMOLD = config.getItem(Configuration.CATEGORY_ITEM, "PickaxeMold", ItemIds.PICKAXEMOLD_DEFAULT).getInt();
		ItemIds.SHOVELMOLD = config.getItem(Configuration.CATEGORY_ITEM, "ShovelMold", ItemIds.SHOVELMOLD_DEFAULT).getInt();
		ItemIds.AXEMOLD = config.getItem(Configuration.CATEGORY_ITEM, "BladeMold", ItemIds.AXEMOLD_DEFAULT).getInt();
		ItemIds.SHAFT = config.getItem(Configuration.CATEGORY_ITEM, "Shaft", ItemIds.SHAFT_DEFAULT).getInt();
		ItemIds.HILT = config.getItem(Configuration.CATEGORY_ITEM, "Hilt", ItemIds.HILT_DEFAULT).getInt();
		ItemIds.MANAPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "ManaPickaxeHead", ItemIds.MANAPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.RUNEPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "RunePickaxeHead", ItemIds.RUNEPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.ADAMANRIUMPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "AdamantiumPickaxeHead", ItemIds.ADAMANTIUMPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.MITHRILPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "MithrilPickaxeHead", ItemIds.MITHRILPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.COPPERPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "CopperPickaxeHead", ItemIds.COPPERPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.BRONZEPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "BronzePickaxeHead", ItemIds.BRONZEPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.SILVERPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "SilverPickaxeHead", ItemIds.SILVERPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.STEELPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "SteelPickaceHead", ItemIds.STEELPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.STARSTEELPICKAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "StarSteelPickaxeHead", ItemIds.STARSTEELPICKAXEHEAD_DEFAULT).getInt();
		ItemIds.MANASHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "ManaShovelHead", ItemIds.MANASHOVELHEAD_DEFAULT).getInt();
		ItemIds.RUNESHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "RuneShovelHead", ItemIds.RUNESHOVELHEAD_DEFAULT).getInt();
		ItemIds.ADAMANTIUMSHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "AdamantiumShovelHead", ItemIds.ADAMANTIUMSHOVELHEAD_DEFAULT).getInt();
		ItemIds.MITHRILSHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "MithrilShovelHead", ItemIds.MITHRILSHOVELHEAD_DEFAULT).getInt();
		ItemIds.COPPERSHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "CopperShovelHead", ItemIds.COPPERSHOVELHEAD_DEFAULT).getInt();
		ItemIds.BRONZESHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "BronzeShovelHead", ItemIds.BRONZESHOVELHEAD_DEFAULT).getInt();
		ItemIds.SILVERSHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "SilverShovelHead", ItemIds.SILVERSHOVELHEAD_DEFAULT).getInt();
		ItemIds.STEELSHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "SteelShovelHead", ItemIds.STEELSHOVELHEAD_DEFAULT).getInt();
		ItemIds.STARSTEELSHOVELHEAD = config.getItem(Configuration.CATEGORY_ITEM, "StarSteelShovelHead", ItemIds.STARSTEELSHOVELHEAD_DEFAULT).getInt();
		ItemIds.MANAAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "ManaAxeHead", ItemIds.MANAAXEHEAD_DEFAULT).getInt();
		ItemIds.RUNEAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "RuneAxeHead", ItemIds.RUNEAXEHEAD_DEFAULT).getInt();
		ItemIds.ADAMANTIUMAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "AdamantiumAxeHead", ItemIds.ADAMANTIUMAXEHEAD_DEFAULT).getInt();
		ItemIds.MITHRILAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "MithrilAxeHead", ItemIds.MITHRILAXEHEAD_DEFAULT).getInt();
		ItemIds.COPPERAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "CopperAxeHead", ItemIds.COPPERAXEHEAD_DEFAULT).getInt();
		ItemIds.BRONZEAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "BronzeAxeHead", ItemIds.BRONZEAXEHEAD_DEFAULT).getInt();
		ItemIds.SILVERAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "SilverAxeHead", ItemIds.SILVERAXEHEAD_DEFAULT).getInt();
		ItemIds.STEELAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "SteelAxeHead", ItemIds.STEELAXEHEAD_DEFAULT).getInt();
		ItemIds.STARSTEELAXEHEAD = config.getItem(Configuration.CATEGORY_ITEM, "StarSteelAxeHead", ItemIds.STARSTEELAXEHEAD_DEFAULT).getInt();
		ItemIds.MANABLADE = config.getItem(Configuration.CATEGORY_ITEM, "ManaBlade", ItemIds.MANABLADE_DEFAULT).getInt();
		ItemIds.RUNEBLADE = config.getItem(Configuration.CATEGORY_ITEM, "RuneBlade", ItemIds.RUNEBLADE_DEFAULT).getInt();
		ItemIds.ADAMANTIUMBLADE = config.getItem(Configuration.CATEGORY_ITEM, "AdamantiumBlade", ItemIds.ADAMANTIUMBLADE_DEFAULT).getInt();
		ItemIds.MITHRILBLADE = config.getItem(Configuration.CATEGORY_ITEM, "MithrilBlade", ItemIds.MITHRILBLADE_DEFAULT).getInt();
		ItemIds.COPPERBLADE = config.getItem(Configuration.CATEGORY_ITEM, "CopperBlade", ItemIds.COPPERBLADE_DEFAULT).getInt();
		ItemIds.BRONZEBLADE = config.getItem(Configuration.CATEGORY_ITEM, "BronzeBlade", ItemIds.BRONZEBLADE_DEFAULT).getInt();
		ItemIds.TITANIUMBLADE = config.getItem(Configuration.CATEGORY_ITEM, "TitaniumBlade", ItemIds.TITANIUMBLADE_DEFAULT).getInt();
		ItemIds.SILVERBLADE = config.getItem(Configuration.CATEGORY_ITEM, "SilverBlade", ItemIds.SILVERBLADE_DEFAULT).getInt();
		ItemIds.STEELBLADE = config.getItem(Configuration.CATEGORY_ITEM, "SteelBlade", ItemIds.STARSTEELBLADE_DEFAULT).getInt();
		ItemIds.STARSTEELBLADE = config.getItem(Configuration.CATEGORY_ITEM, "StarSteelBlade", ItemIds.MAMACRYSTLE_DEFAULT).getInt();
		
	
		
		
		config.save();
	
		

	}

	@Init
	public void init(FMLInitializationEvent event) {
		
		SMBlock.init();
		SMItem.init();
		
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	

}
