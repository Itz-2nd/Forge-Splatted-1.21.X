package net.itzsecond.splattedmc.item.weapon;

import net.itzsecond.splattedmc.item.weapon.projectile.InkProjectile;
import net.itzsecond.splattedmc.weapon.shooter.ShooterStats;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import java.util.Properties;

public class ModShooterClass extends ModWeaponClassBuilder {
    public ModShooterClass(Properties properties) {
        super(properties);
    }

    protected ShooterStats stats; //not sure if I should generalize this
    public void fireWeapon(Level level, Player player, ItemStack stack) {

        // System.out.println("Spawning projectile"); testing if projectile is being spawned

        if (this.stats == null) {
            System.out.println("STATS NULL");
            return;
        }


        if (level.isClientSide) return;

        InkProjectile projectile = new InkProjectile(level, player);
        projectile.setWeaponStats(this.stats);
        if (this.stats == null) {
            System.out.println("WEAPON STATS NULL BEFORE SHOOT");
        }

        projectile.shootFromRotation(
                player,
                player.getXRot(),
                player.getYRot(),
                0.0F,
                this.stats.shot_velocity,
                this.stats.shot_inaccuracy
        );

        level.addFreshEntity(projectile);
    }

    public ShooterStats getStats() {
        return this.stats;
    }


    //temporary while adding firerate
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        fireWeapon(level, player, stack);

        return InteractionResultHolder.consume(stack);
    }

}
