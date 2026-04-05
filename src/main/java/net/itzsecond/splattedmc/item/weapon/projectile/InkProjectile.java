package net.itzsecond.splattedmc.item.weapon.projectile;

import net.itzsecond.splattedmc.combat.damage.DamageContext;
import net.itzsecond.splattedmc.item.entity.ModEntities;
import net.itzsecond.splattedmc.item.weapon.ModWeaponClassBuilder;
import net.itzsecond.splattedmc.weapon.shooter.ShooterStats;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class InkProjectile extends ThrowableItemProjectile {

    public InkProjectile(EntityType<? extends InkProjectile> type, Level level) {
        super(type, level);
    }

    public InkProjectile(Level level, LivingEntity shooter) {
        super(ModEntities.INK_PROJECTILE.get(), shooter, level);
    }

    @Override
    protected void  onHit(HitResult result) {
        super.onHit(result);
        this.discard(); //kills projectile
    }

    @Override
    protected Item getDefaultItem() {
        return Items.SNOWBALL; //placeholder projectile
    }

    private ShooterStats stats;

    public void setWeaponStats(ShooterStats stats) {
        this.stats = stats;
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        if (this.stats == null) {
            System.out.println("PROJECTILE STATS NULL ON HIT");
            return;
        }

        if(!(result.getEntity() instanceof LivingEntity target)) return;

        if(!(this.getOwner() instanceof Player attacker)) return;

        float distance = (float) this.distanceTo(target);

        DamageContext context = new DamageContext(
                distance,
                true, //direct hit on target
                attacker,
                target
        );

        float damage = this.stats.damageProfile.computeDamage(context);

        target.hurt(this.damageSources().thrown(this, attacker), damage);

        super.onHitEntity(result);
    }



}
