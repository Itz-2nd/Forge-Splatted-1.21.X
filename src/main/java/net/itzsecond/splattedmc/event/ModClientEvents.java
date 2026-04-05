package net.itzsecond.splattedmc.event;

import net.itzsecond.splattedmc.entity.client.InkProjectileRenderer;
import net.itzsecond.splattedmc.item.entity.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "splattedmc", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {

    //rendering projectile
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(
                ModEntities.INK_PROJECTILE.get(),
                InkProjectileRenderer::new
        );
    }

}
