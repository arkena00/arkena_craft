package com.arkena.item;

import com.arkena.ArkenaMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AnekraTearsItem extends Item {

    public AnekraTearsItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
    {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {

            world.playSound(null, player.getBlockPos(), ArkenaMod.SOUNDEVENT_NOT_PREPARED, SoundCategory.BLOCKS, 1f,1f);

            MutableText MessageText = Text.literal("<Aneleya's Guardian>").formatted(Formatting.DARK_PURPLE);
            MessageText.append(Text.literal(" You are not prepared "));
            MessageText.append(player.getDisplayName());

            player.sendMessage(MessageText);

            player.getItemCooldownManager().set(this, 300);

            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            player.kill();
                        }
                    },
                    3000
            );

            player.emitGameEvent(GameEvent.ENTITY_DIE, player);
        }

        return super.use(world, player, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        tooltip.add(Text.translatable("item.arkena.anekra_tears.tooltip"));
        tooltip.add(Text.translatable("item.arkena.anekra_tears.tooltip_2").formatted(Formatting.DARK_PURPLE));
    }
}