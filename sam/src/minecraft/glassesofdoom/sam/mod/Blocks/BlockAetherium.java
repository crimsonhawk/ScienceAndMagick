package glassesofdoom.sam.mod.Blocks;

import glassesofdoom.sam.mod.SAMMain;
import glassesofdoom.sam.mod.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAetherium extends Block {
		public BlockAetherium(int id) {
			super(id, Material.rock);
			
			this.setCreativeTab(SAMMain.TabsSam);
			this.setBlockName(Strings.Block_Aetherium_Name);
			
			
		}
		

	}
