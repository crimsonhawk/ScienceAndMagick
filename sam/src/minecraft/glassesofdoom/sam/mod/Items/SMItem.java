package glassesofdoom.sam.mod.Items;

import net.minecraft.item.Item;
import glassesofdoom.sam.mod.lib.ItemIds;
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
		ManaCrystle = new ItemManaCrystle(ItemIds.MAMACRYSTLE).setIconIndex(0);
		ManaIngot = new ItemManaIngot(ItemIds.MANAINGOT).setIconIndex(0);
		RuneIngot = new ItemRuneIngot(ItemIds.RUNEINGOT).setIconIndex(0);
		AdamatiumIngot = new ItemAdamatiumIngot(ItemIds.ADAMANTIUMINGOT).setIconIndex(0);
		AetheriumIngot = new ItemAetheriumIngot(ItemIds.AETHERIUMINGOT).setIconIndex(0);
		OrichalcumIngot = new ItemOrichalcumIngot(ItemIds.ORICHALCUMINGOT).setIconIndex(0);
		WonderfloniumIngot = new ItemWonderfloniumIngot(ItemIds.WONDERFLONIUMINGOT).setIconIndex(0);
		MithrilIngot = new ItemMithrilIngot(ItemIds.MITHRILINGOT).setIconIndex(0);
		SiliconIngot = new ItemSiliconIngot(ItemIds.SILICONINGOT).setIconIndex(0);
		TinIngot = new ItemTinIngot(ItemIds.TININGOT).setIconIndex(0);
		CopperIngot = new ItemCopperIngot(ItemIds.COPPERINGOT).setIconIndex(0);
		BronzeIngot = new ItemBronzeIngot(ItemIds.BRONZEINGOT).setIconIndex(0);
		TitaniumIngot = new ItemTitaniumIngot(ItemIds.TITANIUMINGOT).setIconIndex(0);
		SilverIngot = new ItemSilverIngot(ItemIds.SILVERINGOT).setIconIndex(0);
		SteelIngot = new ItemSteelIngot(ItemIds.STEELINGOT).setIconIndex(0);
		StarSteelIngot = new ItemStarSteelIngot(ItemIds.STARSTEELINGOT).setIconIndex(0);
		IngotMold = new ItemIngotMold(ItemIds.INGOTMOLD).setIconIndex(0);
		PickaxeMold = new ItemPickaxeMold(ItemIds.PICKAXEMOLD).setIconIndex(0);
		ShovelMold = new ItemShovelMold(ItemIds.SHOVELMOLD).setIconIndex(0);
		AxeMold = new ItemAxeMold(ItemIds.AXEMOLD).setIconIndex(0);
		BladeMold = new ItemBladeMold(ItemIds.BLADEMOLD).setIconIndex(0);
		Shaft = new ItemShaft(ItemIds.SHAFT).setIconIndex(0);
		Hilt = new ItemHilt(ItemIds.HILT).setIconIndex(0);
		ManaPickaxeHead = new ItemManaPickaxeHead(ItemIds.MANAPICKAXEHEAD).setIconIndex(0);
		RunePickaxeHead = new ItemRunePickaxeHead(ItemIds.RUNEPICKAXEHEAD).setIconIndex(0);
		AdamantiumPickaxeHead = new ItemAdamantiumPickaxeHead(ItemIds.ADAMANRIUMPICKAXEHEAD).setIconIndex(0);
		MithrilPickaxeHead = new ItemMithrilPickaxeHead(ItemIds.MITHRILPICKAXEHEAD).setIconIndex(0);
		CopperPickaxeHead = new ItemCopperPickaxeHead(ItemIds.COPPERPICKAXEHEAD).setIconIndex(0);
		BronzePickaxeHead = new ItemBronzePickaxeHead(ItemIds.BRONZEPICKAXEHEAD).setIconIndex(0);
		SilverPickaxeHead = new ItemSilverPickaxeHead(ItemIds.SILVERPICKAXEHEAD).setIconIndex(0);
		SteelPickaceHead = new ItemSteelPickaceHead(ItemIds.STEELPICKAXEHEAD).setIconIndex(0);
		StarSteelPickaxeHead = new ItemStarSteelPickaxeHead(ItemIds.STARSTEELPICKAXEHEAD).setIconIndex(0);
		ManaShovelHead = new ItemManaShovelHead(ItemIds.MANASHOVELHEAD).setIconIndex(0);
		RuneShovelHead = new ItemRuneShovelHead(ItemIds.RUNESHOVELHEAD).setIconIndex(0);
		AdamantiumShovelHead = new ItemAdamantiumShovelHead(ItemIds.ADAMANTIUMSHOVELHEAD).setIconIndex(0);
		MithrilShovelHead = new ItemMithrilShovelHead(ItemIds.MITHRILSHOVELHEAD).setIconIndex(0);
		CopperShovelHead = new ItemCopperShovelHead(ItemIds.COPPERSHOVELHEAD).setIconIndex(0);
		BronzeShovelHead = new ItemBronzeShovelHead(ItemIds.BRONZESHOVELHEAD).setIconIndex(0);
		SilverShovelHead = new ItemSilverShovelHead(ItemIds.SILVERSHOVELHEAD).setIconIndex(0);
		SteelShovelHead = new ItemSteelShovelHead(ItemIds.STEELSHOVELHEAD).setIconIndex(0);
		StarSteelShovelHead = new ItemStarSteelShovelHead(ItemIds.STARSTEELSHOVELHEAD).setIconIndex(0);
		ManaAxeHead = new ItemManaAxeHead(ItemIds.MANAAXEHEAD).setIconIndex(0);
		RuneAxeHead = new ItemRuneAxeHead(ItemIds.RUNEAXEHEAD).setIconIndex(0);
		AdamantiumAxeHead = new ItemAdamantiumAxeHead(ItemIds.ADAMANTIUMAXEHEAD).setIconIndex(0);
		MithrilAxeHead = new ItemMithrilAxeHead(ItemIds.MITHRILAXEHEAD).setIconIndex(0);
		CopperAxeHead = new ItemCopperAxeHead(ItemIds.COPPERAXEHEAD).setIconIndex(0);
		BronzeAxeHead = new ItemBronzeAxeHead(ItemIds.BRONZEAXEHEAD).setIconIndex(0);
		SilverAxeHead = new ItemSilverAxeHead(ItemIds.SILVERAXEHEAD).setIconIndex(0);
		SteelAxeHead = new ItemSteelAxeHead(ItemIds.STEELAXEHEAD).setIconIndex(0);
		StarSteelAxeHead = new ItemStarSteelAxeHead(ItemIds.STARSTEELAXEHEAD).setIconIndex(0);
		ManaBlade = new ItemManaBlade(ItemIds.MANABLADE).setIconIndex(0);
		RuneBlade = new ItemRuneBlade(ItemIds.RUNEBLADE).setIconIndex(0);
		AdamantiumBlade = new ItemAdamantiumBlade(ItemIds.ADAMANTIUMBLADE).setIconIndex(0);
		MithrilBlade = new ItemMithrilBlade(ItemIds.MITHRILBLADE).setIconIndex(0);
		CopperBlade = new ItemCopperBlade(ItemIds.COPPERBLADE).setIconIndex(0);
		BronzeBlade = new ItemBronzeBlade(ItemIds.BRONZEBLADE).setIconIndex(0);
		TitaniumBlade = new ItemTitaniumBlade(ItemIds.TITANIUMBLADE).setIconIndex(0);
		SilverBlade = new ItemSilverBlade(ItemIds.SILVERBLADE).setIconIndex(0);
		SteelBlade = new ItemSteelBlade(ItemIds.STEELBLADE).setIconIndex(0);
		StarSteelBlade = new ItemStarSteelBlade(ItemIds.STARSTEELBLADE).setIconIndex(0);

		
	}

}
