package com.arkena;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

public class ServerTickCallback implements ServerTickEvents.StartTick{
    @Override
    public void onStartTick(MinecraftServer minecraftServer){
        for (ServerPlayerEntity entity : minecraftServer.getPlayerManager().getPlayerList()) {

            //if (entity.getItemBySlot(EquipmentSlot.LEGS).getItem() == AMItemRegistry.CENTIPEDE_LEGGINGS.get()) {
                /*if (entity.horizontalCollision && !entity.isSubmergedInWater()) {
                    entity.fallDistance = 0.0F;
                    Vec3 motion = entity.getDeltaMovement();
                    entity.getMovementDirection()
                    double d2 = 0.1D;
                    if (entity.isShiftKeyDown() || !entity.getFeetBlockState().isScaffolding(entity) && entity.isSuppressingSlidingDownLadder()) {
                        d2 = 0.0D;
                    }
                    motion = new Vec3(Mth.clamp(motion.x, -0.15F, 0.15F), d2, Mth.clamp(motion.z, -0.15F, 0.15F));
                    entity.setDeltaMovement(motion);
                }*/
            //}
        }
    }
}