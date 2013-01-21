package glassesofdoom.sam.mod.Blocks;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Reference;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAdamantium extends Block {

	public BlockAdamantium(int id) {
		super(id, Material.rock);
		
		this.setBlockName(Strings.Block_Adamantium_Name);
		this.setCreativeTab(SAMMain.TabsSam);
		
		
	}

	
}


