package glassesofdoom.sam.mod.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabsSAMItems extends CreativeTabs{

	public CreativeTabsSAMItems(String lable) {
		super(lable);
		
	}
	
	public ItemStack getIconItemstatck(){
		return new ItemStack(Item.arrow);
		
	}

}
