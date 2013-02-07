package glassesofdoom.sam.mod.Items;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.item.Item;

public class ItemRuneShovelHead extends Item{

	public ItemRuneShovelHead(int id) {
		super(id);
		this.setCreativeTab(SAMMain.TabsSamItems);
		this.setItemName(Strings.Item_Shovel_head_Rune_Name);
	}

}
