package net.itzsecond.splattedmc.item.weapon.shooter;

import net.itzsecond.splattedmc.combat.damage.ShooterDamageProfile;
import net.itzsecond.splattedmc.item.weapon.ModShooterClass;
import net.itzsecond.splattedmc.item.weapon.ModWeaponClassBuilder;
import net.itzsecond.splattedmc.weapon.shooter.ShooterStats;

public class SplatterShotJr extends ModShooterClass {

    public SplatterShotJr(Properties properties) {
        super(properties);

        this.stats = new ShooterStats(
                .8F,
                4.0F,
                2,
                2.0F,
                new ShooterDamageProfile(5.0F,2.0F,20.0F)
        );
    }
}
