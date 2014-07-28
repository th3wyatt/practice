package com.th3wyatt.practice.item;

import com.th3wyatt.practice.creativetab.CreativeTabPractice;
import com.th3wyatt.practice.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

/**
 * Created by Jon on 7/27/2014.
 */
public class ItemLeaf extends ItemPractice{

        public ItemLeaf()
        {
            super();
            this.setUnlocalizedName("Leaf");
            this.setCreativeTab(CreativeTabPractice.PRACTICE_TAB);

        }


}