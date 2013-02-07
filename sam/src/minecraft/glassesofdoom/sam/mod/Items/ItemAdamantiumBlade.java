package glassesofdoom.sam.mod.Items;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.item.Item;

public class ItemAdamantiumBlade extends Item{

	public ItemAdamantiumBlade(int id) {
		super(id);
		this.setCreativeTab(SAMMain.TabsSamItems);
		this.setItemName(Strings.Item_Blade_Adamantium_Name);
	}

}
