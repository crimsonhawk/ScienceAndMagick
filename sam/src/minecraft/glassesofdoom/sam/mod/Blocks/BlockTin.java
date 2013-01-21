package glassesofdoom.sam.mod.Blocks;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTin extends Block {

	public BlockTin(int id) {
		super(id, Material.rock);
		
		this.setCreativeTab(SAMMain.TabsSam);
		this.setBlockName(Strings.Block_Tin_Name);
		
		
	}
	

}
