package glassesofdoom.sam.mod.Items;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.item.Item;

public class ItemCopperBlade extends Item{

	public ItemCopperBlade(int id) {
		super(id);
		this.setCreativeTab(SAMMain.TabsSamItems);
		this.setItemName(Strings.Item_Blade_Copper_Name);
	}

}
