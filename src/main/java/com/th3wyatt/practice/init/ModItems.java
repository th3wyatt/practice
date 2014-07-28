package com.th3wyatt.practice.init;

import com.th3wyatt.practice.item.ItemLeaf;
import com.th3wyatt.practice.item.ItemPractice;
import com.th3wyatt.practice.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Jon on 7/27/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemPractice Leaf = new ItemLeaf();

    public static void init(){

        GameRegistry.registerItem(Leaf, "Leaf");

    }

}
