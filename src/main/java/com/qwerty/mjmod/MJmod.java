package com.qwerty.mjmod;

import com.qwerty.mjmod.diamond_dagger.DiamondDaggerSwordBase;
import com.qwerty.mjmod.diamond_dagger.DiamondDaggerToolMaterial;
import com.qwerty.mjmod.golden_dagger.GoldenDaggerSwordBase;
import com.qwerty.mjmod.golden_dagger.GoldenDaggerToolMaterial;
import com.qwerty.mjmod.iron_dagger.IronDaggerToolMaterial;
import com.qwerty.mjmod.iron_dagger.IronDaggerSwordBase;
import com.qwerty.mjmod.netherite_dagger.NetheriteDaggerSwordBase;
import com.qwerty.mjmod.netherite_dagger.NetheriteDaggerToolMaterial;
import com.qwerty.mjmod.stone_dagger.StoneDaggerSwordBase;
import com.qwerty.mjmod.stone_dagger.StoneDaggerToolMaterial;
import com.qwerty.mjmod.wooden_dagger.WoodenDaggerSwordBase;
import com.qwerty.mjmod.wooden_dagger.WoodenDaggerToolMaterial;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MJmod implements ModInitializer {
    public static final String MOD_ID = "mjmod";

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wooden_dagger"), new WoodenDaggerSwordBase(new WoodenDaggerToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_dagger"), new StoneDaggerSwordBase(new StoneDaggerToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_dagger"),new GoldenDaggerSwordBase(new GoldenDaggerToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_dagger"), new IronDaggerSwordBase(new IronDaggerToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_dagger"), new DiamondDaggerSwordBase(new DiamondDaggerToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_dagger"), new NetheriteDaggerSwordBase(new NetheriteDaggerToolMaterial()));
    }
}
