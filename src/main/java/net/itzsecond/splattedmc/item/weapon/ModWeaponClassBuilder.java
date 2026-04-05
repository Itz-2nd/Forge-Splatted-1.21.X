package net.itzsecond.splattedmc.item.weapon;
import net.itzsecond.splattedmc.combat.damage.DamageContext;
import net.itzsecond.splattedmc.item.weapon.projectile.InkProjectile;
import net.itzsecond.splattedmc.weapon.shooter.ShooterStats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class ModWeaponClassBuilder extends Item {

    public ModWeaponClassBuilder(Properties properties) {
        super(properties);
    }

    //For right Click input:
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        //System.out.println(this.getClass().getName());  testing if weapon is in main hand
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }

    // Bassiclly our "inktank"
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 72000;
    }

    //used to apply an Animation
   @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.NONE;
    }

    protected ShooterStats stats;

    public Object setWeaponStats() {
        return this.stats;
    }


}
