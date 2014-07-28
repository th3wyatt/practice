package com.th3wyatt.practice.init;

import com.th3wyatt.practice.block.BlockLuminte;
import com.th3wyatt.practice.block.blockPractice;
import com.th3wyatt.practice.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Jon on 7/27/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final blockPractice Luminite = new BlockLuminte();

    public static void init(){

        GameRegistry.registerBlock(Luminite, "Luminte");
    }
}
