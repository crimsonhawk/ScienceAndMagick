package glassesofdoom.sam.mod.Items;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.item.Item;

public class ItemSilverBlade extends Item{

	public ItemSilverBlade(int id) {
		super(id);
		this.setCreativeTab(SAMMain.TabsSamItems);
		this.setItemName(Strings.Item_Blade_Silver_Name);
	}

}
