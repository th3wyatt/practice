package com.th3wyatt.practice.creativetab;

import com.th3wyatt.practice.init.ModItems;
import com.th3wyatt.practice.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Jon on 7/27/2014.
 */
public class CreativeTabPractice {

    public static final CreativeTabs PRACTICE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.Leaf;
        }
    };

}
