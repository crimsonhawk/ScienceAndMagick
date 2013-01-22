package glassesofdoom.sam.mod.Items;

import glassesofdoom.sam.mod.lib.ItemIds;
import cpw.mods.fml.common.Mod.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class SMItem {
	
	public static Item ManaCrystle;
	public static Item ManaIngot;
	public static Item RuneIngot;
	public static Item AdamatiumIngot;
	public static Item AetheriumIngot;
	public static Item OrichalcumIngot;
	public static Item WonderfloniumIngot;
	public static Item MithrilIngot;
	public static Item SiliconIngot;
	public static Item TinIngot;
	public static Item CopperIngot;
	public static Item BronzeIngot;
	public static Item TitaniumIngot;
	public static Item SilverIngot;
	public static Item SteelIngot;
	public static Item StarSteelIngot;
	public static Item IngotMold;
	public static Item PickaxeMold;
	public static Item ShovelMold;
	public static Item AxeMold;
	public static Item BladeMold;
	public static Item Shaft;
	public static Item Hilt;
	public static Item ManaPickaxeHead;
	public static Item RunePickaxeHead;
	public static Item AdamantiumPickaxeHead;
	public static Item MithrilPickaxeHead;
	public static Item CopperPickaxeHead;
	public static Item BronzePickaxeHead;
	public static Item SilverPickaxeHead;
	public static Item SteelPickaceHead;
	public static Item StarSteelPickaxeHead;
	public static Item ManaShovelHead;
	public static Item RuneShovelHead;
	public static Item AdamantiumShovelHead;
	public static Item MithrilShovelHead;
	public static Item CopperShovelHead;
	public static Item BronzeShovelHead;
	public static Item SilverShovelHead;
	public static Item SteelShovelHead;
	public static Item StarSteelShovelHead;
	public static Item ManaAxeHead;
	public static Item RuneAxeHead;
	public static Item AdamantiumAxeHead;
	public static Item MithrilAxeHead;
	public static Item CopperAxeHead;
	public static Item BronzeAxeHead;
	public static Item SilverAxeHead;
	public static Item SteelAxeHead;
	public static Item StarSteelAxeHead;
	public static Item ManaBlade;
	public static Item RuneBlade;
	public static Item AdamantiumBlade;
	public static Item MithrilBlade;
	public static Item CopperBlade;
	public static Item BronzeBlade;
	public static Item TitaniumBlade;
	public static Item SilverBlade;
	public static Item SteelBlade;
	public static Item StarSteelBlade;
	
	
	

	public static void init() {
		/* Note to get started on items */
/*		ManaCrystle = new ItemManaCrystle(ItemIds.MAMACRYSTLE);
		ManaIngot = new ItemManaIngot(ItemIds.MANAINGOT);
		RuneIngot = new ItemRuneIngot(ItemIds.RUNEINGOT);
		AdamatiumIngot = new ItemAdamatiumIngot(ItemIds.ADAMANTIUMINGOT);
		AetheriumIngot = new ItemAetheriumIngot(ItemIds.AETHERIUMINGOT);
		OrichalcumIngot = new ItemOrichalcumIngot(ItemIds.ORICHALCUMINGOT);
		WonderfloniumIngot = new ItemWonderfloniumIngot(ItemIds.WONDERFLONIUMINGOT);
		MithrilIngot = new ItemMithrilIngot(ItemIds.MITHRILINGOT);
		SiliconIngot = new ItemSiliconIngot(ItemIds.SILICONINGOT);
		TinIngot = new ItemTinIngot(ItemIds.TININGOT);
		CopperIngot = new ItemCopperIngot(ItemIds.COPPERINGOT);
		BronzeIngot = new ItemBronzeIngot(ItemIds.BRONZEINGOT);
		TitaniumIngot = new ItemTitaniumIngot(ItemIds.TITANIUMINGOT);
		SilverIngot = new ItemSilverIngot(ItemIds.SILVERINGOT);
		SteelIngot = new ItemSteelIngot(ItemIds.STEELINGOT);
		StarSteelIngot = new ItemStarSteelIngot(ItemIds.STARSTEELINGOT);
		IngotMold = new ItemIngotMold(ItemIds.INGOTMOLD);
		PickaxeMold = new ItemPickaxeMold(ItemIds.PICKAXEMOLD);
		ShovelMold = new ItemShovelMold(ItemIds.SHOVELMOLD);
		AxeMold = new ItemAxeMold(ItemIds.AXEMOLD);
		BladeMold = new ItemBladeMold(ItemIds.BLADEMOLD);
		Shaft = new ItemShaft(ItemIds.SHAFT);
		Hilt = new ItemHilt(ItemIds.HILT);
		ManaPickaxeHead = new ItemManaPickaxeHead(ItemIds.MANAPICKAXEHEAD);
		RunePickaxeHead = new ItemRunePickaxeHead(ItemIds.RUNEPICKAXEHEAD);
		AdamantiumPickaxeHead = new ItemAdamantiumPickaxeHead(ItemIds.ADAMANRIUMPICKAXEHEAD);
		MithrilPickaxeHead = new ItemMithrilPickaxeHead(ItemIds.MITHRILPICKAXEHEAD);
		CopperPickaxeHead = new ItemCopperPickaxeHead(ItemIds.COPPERPICKAXEHEAD);
		BronzePickaxeHead = new ItemBronzePickaxeHead(ItemIds.BRONZEPICKAXEHEAD);
		SilverPickaxeHead = new ItemSilverPickaxeHead(ItemIds.SILVERPICKAXEHEAD);
		SteelPickaceHead = new ItemSteelPickaceHead(ItemIds.STEELPICKAXEHEAD);
		StarSteelPickaxeHead = new ItemStarSteelPickaxeHead(ItemIds.STARSTEELPICKAXEHEAD);
		ManaShovelHead = new ItemManaShovelHead(ItemIds.MANASHOVELHEAD);
		RuneShovelHead = new ItemRuneShovelHead(ItemIds.RUNESHOVELHEAD);
		AdamantiumShovelHead = new ItemAdamantiumShovelHead(ItemIds.ADAMANTIUMSHOVELHEAD);
		MithrilShovelHead = new ItemMithrilShovelHead(ItemIds.MITHRILSHOVELHEAD);
		CopperShovelHead = new ItemCopperShovelHead(ItemIds.COPPERSHOVELHEAD);
		BronzeShovelHead = new ItemBronzeShovelHead(ItemIds.BRONZESHOVELHEAD);
		SilverShovelHead = new ItemSilverShovelHead(ItemIds.SILVERSHOVELHEAD);
		SteelShovelHead = new ItemSteelShovelHead(ItemIds.STEELSHOVELHEAD);
		StarSteelShovelHead = new ItemStarSteelShovelHead(ItemIds.STARSTEELSHOVELHEAD);
		ManaAxeHead = new ItemManaAxeHead(ItemIds.MANAAXEHEAD);
		RuneAxeHead = new ItemRuneAxeHead(ItemIds.RUNEAXEHEAD);
		AdamantiumAxeHead = new ItemAdamantiumAxeHead(ItemIds.ADAMANTIUMAXEHEAD);
		MithrilAxeHead = new ItemMithrilAxeHead(ItemIds.MITHRILAXEHEAD);
		CopperAxeHead = new ItemCopperAxeHead(ItemIds.COPPERAXEHEAD);
		BronzeAxeHead = new ItemBronzeAxeHead(ItemIds.BRONZEAXEHEAD);
		SilverAxeHead = new ItemSilverAxeHead(ItemIds.SILVERAXEHEAD);
		SteelAxeHead = new ItemSteelAxeHead(ItemIds.STEELAXEHEAD);
		StarSteelAxeHead = new ItemStarSteelAxeHead(ItemIds.STARSTEELAXEHEAD);
		ManaBlade = new ItemManaBlade(ItemIds.MANABLADE);
		RuneBlade = new ItemRuneBlade(ItemIds.RUNEBLADE);
		AdamantiumBlade = new ItemAdamantiumBlade(ItemIds.ADAMANTIUMBLADE);
		MithrilBlade = new ItemMithrilBlade(ItemIds.MITHRILBLADE);
		CopperBlade = new ItemCopperBlade(ItemIds.COPPERBLADE);
		BronzeBlade = new ItemBronzeBlade(ItemIds.BRONZEBLADE);
		TitaniumBlade = new ItemTitaniumBlade(ItemIds.TITANIUMBLADE);
		SilverBlade = new ItemSilverBlade(ItemIds.SILVERBLADE);
		SteelBlade = new ItemSteelBlade(ItemIds.STEELBLADE);
		StarSteelBlade = new ItemStarSteelBlade(ItemIds.STARSTEELBLADE);
	
	*/	
	}

}
