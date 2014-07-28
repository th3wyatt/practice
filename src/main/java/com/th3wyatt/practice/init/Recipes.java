package com.th3wyatt.practice.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void init(){

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Leaf), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.Luminite), "glowstone", "glowstone", "glowstone"));

    }

}
