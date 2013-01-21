package glassesofdoom.sam.mod.Blocks;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRune extends Block {
	public BlockRune(int id) {
		super(id, Material.rock);
		
		this.setBlockName(Strings.Block_Rune_Name);
		this.setCreativeTab(SAMMain.TabsSam);
		
		
	}
	

}
