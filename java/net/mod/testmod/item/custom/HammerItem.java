package net.modandrew.testmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class HammerItem extends AxeItem {
    public HammerItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }


    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addPotionEffect(new EffectInstance(Effects.WITHER,5,5));
        return super.hitEntity(stack, target, attacker);
    }
}
