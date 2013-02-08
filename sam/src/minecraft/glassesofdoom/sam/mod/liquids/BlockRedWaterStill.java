package glassesofdoom.sam.mod.liquids;

import glassesofdoom.sam.mod.lib.LiquidIds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;

public class BlockRedWaterStill extends BlockStationary{

	public BlockRedWaterStill(int id) {
		super(id, Material.water);
		
		this.setHardness(100f);
		this.setLightOpacity(3);
		this.disableStats();
        this.setRequiresSelfNotify();
	}

}