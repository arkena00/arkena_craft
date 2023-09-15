package com.arkena.core;

import com.arkena.armor.AnekraArmorMaterial;
import com.arkena.armor.testing;
import com.arkena.item.AnekraTearsItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArkenaItems {

    public static final ArmorMaterial ANEKRA_ARMOR_MATERIAL = new AnekraArmorMaterial();
    public static final ArmorMaterial SLIME_ARMOR_MATERIAL = new testing();

    public static final Item ANEKRA_HELMET = new ArmorItem(ANEKRA_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item SPIDER_CALECON = new ArmorItem(SLIME_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());

    public static final Item ANEKRA_TEARS_ITEM = new AnekraTearsItem(new FabricItemSettings().maxCount(1));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("arkena", "anekra_tears"), ANEKRA_TEARS_ITEM);
        Registry.register(Registry.ITEM, new Identifier("arkena", "anekra_armor_helmet"), ANEKRA_HELMET);
        Registry.register(Registry.ITEM, new Identifier("arkena", "spider_calecon"), SPIDER_CALECON);
    }
}