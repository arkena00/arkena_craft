package com.arkena.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class testing implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {99};
    private static final int[] PROTECTION_VALUES = new int[] {99};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 99;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 99;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_AMETHYST_CLUSTER_STEP;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.EMPTY;
    }

    @Override
    public String getName() {
        return "spider";
    }

    @Override
    public float getToughness() {
        return 99.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.9F;
    }
}