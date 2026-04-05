package net.itzsecond.splattedmc.weapon.shooter;

import net.itzsecond.splattedmc.combat.damage.DamageProfile;
import net.itzsecond.splattedmc.combat.damage.ShooterDamageProfile;
import net.itzsecond.splattedmc.weapon.WeaponStats;

public class ShooterStats extends WeaponStats {
    public final float shot_velocity;
    public final float shot_inaccuracy;

    public ShooterStats(
            float shot_velocity,
            float shot_inaccuracy,
            int FireRateTicks,
            float StrafeSpeed,
            DamageProfile damageProfile
    ) {
        super(damageProfile, FireRateTicks, StrafeSpeed);
        this.shot_velocity = shot_velocity;
        this.shot_inaccuracy = shot_inaccuracy;
    }

}
