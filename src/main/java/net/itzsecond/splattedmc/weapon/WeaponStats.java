package net.itzsecond.splattedmc.weapon;

import net.itzsecond.splattedmc.combat.damage.DamageProfile;

public class WeaponStats {
    public final int FireRateTicks; //determines the ticks between how long a weapon can fire again
    public final DamageProfile damageProfile; //handles min and max damage as well as effective range
    public final float StrafeSpeed; //determines max movement speed when firing

    public WeaponStats(DamageProfile damageProfile, int FireRateTicks, float StrafeSpeed) {
        this.damageProfile = damageProfile;
        this.FireRateTicks = FireRateTicks;
        this.StrafeSpeed = StrafeSpeed;
    }


}
