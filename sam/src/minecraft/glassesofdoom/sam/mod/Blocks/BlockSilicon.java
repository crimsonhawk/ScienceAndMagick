package glassesofdoom.sam.mod.Blocks;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSilicon extends Block {

	public BlockSilicon(int id) {
		super(id, Material.rock);
		
		this.setCreativeTab(SAMMain.TabsSam);
		this.setBlockName(Strings.Block_Silicon_Name);
		
		
	}
	

}
