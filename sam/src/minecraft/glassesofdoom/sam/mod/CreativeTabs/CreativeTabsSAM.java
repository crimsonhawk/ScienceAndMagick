package glassesofdoom.sam.mod.CreativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabsSAM extends CreativeTabs{

	public CreativeTabsSAM(String lable) {
		super(lable);
		
		
	}
	@SideOnly(Side.CLIENT)
	
	public ItemStack getTabIconIndex(){
		return new ItemStack(Item.appleGold);
	}

}
