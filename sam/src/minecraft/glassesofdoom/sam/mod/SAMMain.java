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
