package net.itzsecond.splattedmc.entity.client;

import net.itzsecond.splattedmc.item.weapon.projectile.InkProjectile;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

public class InkProjectileRenderer extends ThrownItemRenderer<InkProjectile> {
    public InkProjectileRenderer(EntityRendererProvider.Context context) {
        super(context);
        //System.out.println("Projectile constructed"); testing is projectile being made
    }
}
