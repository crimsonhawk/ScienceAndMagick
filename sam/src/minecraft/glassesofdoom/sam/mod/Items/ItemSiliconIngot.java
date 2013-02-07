package glassesofdoom.sam.mod.Items;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.item.Item;

public class ItemSiliconIngot extends Item{

	public ItemSiliconIngot(int id) {
		super(id);
		//this.setCreativeTab(SAMMain.TabsSamItems);
		this.setItemName(Strings.Item_Silicon_Ingot_Name);
	}

}
