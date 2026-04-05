package net.itzsecond.splattedmc.combat.damage;

public class ShooterDamageProfile extends DamageProfile {

    private final float maxDamage;
    private final float minDamage;
    private final float maxRange;

    public ShooterDamageProfile(float maxDamage, float minDamage, float maxRange) {
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.maxRange = maxRange;
    }

    @Override
    public float computeDamage(DamageContext context) {
        float t = Math.min(context.distance / maxRange, 1.0F);
        return maxDamage - t * (maxDamage - minDamage);
    }
}
