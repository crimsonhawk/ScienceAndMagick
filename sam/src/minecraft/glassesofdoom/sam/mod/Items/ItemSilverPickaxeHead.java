package glassesofdoom.sam.mod.Items;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.item.Item;

public class ItemSilverPickaxeHead extends Item{

	public ItemSilverPickaxeHead(int id) {
		super(id);
		this.setCreativeTab(SAMMain.TabsSamItems);
		this.setItemName(Strings.Item_Pickaxe_head_Silver_Name);
	}

}
