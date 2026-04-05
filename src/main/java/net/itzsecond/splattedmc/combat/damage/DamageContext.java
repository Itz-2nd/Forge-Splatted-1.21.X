package net.itzsecond.splattedmc.combat.damage;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class DamageContext {
    public final float distance;
    public final boolean isDirectHit;
    public final Player attacker;
    public final LivingEntity target;

    public DamageContext(float distance, boolean isDirectHit, Player attacker, LivingEntity target) {
        this.distance = distance;
        this.isDirectHit = isDirectHit;
        this.attacker = attacker;
        this.target = target;
    }
}
