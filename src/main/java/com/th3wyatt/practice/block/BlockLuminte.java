package com.th3wyatt.practice.block;

import com.th3wyatt.practice.creativetab.CreativeTabPractice;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Jon on 7/27/2014.
 */
public class BlockLuminte extends blockPractice {

    public BlockLuminte(){

        super();
        this.setBlockName("Luminite");
        this.setLightLevel(1);
        this.setHardness(3.0F);
        this.setResistance(3.0F);
        this.setStepSound(soundTypePiston).setBlockTextureName("Luminite");
        this.setCreativeTab(CreativeTabPractice.PRACTICE_TAB);

    }
}
