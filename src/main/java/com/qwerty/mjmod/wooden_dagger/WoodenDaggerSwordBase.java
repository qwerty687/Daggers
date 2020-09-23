package com.qwerty.mjmod.wooden_dagger;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class WoodenDaggerSwordBase extends SwordItem {
    public WoodenDaggerSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 2, 21.0f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
