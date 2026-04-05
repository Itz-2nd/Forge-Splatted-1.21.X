package net.itzsecond.splattedmc.event;

import net.itzsecond.splattedmc.item.weapon.ModShooterClass;
import net.itzsecond.splattedmc.item.weapon.ModWeaponClassBuilder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.FORGE;

@Mod.EventBusSubscriber(modid = "splattedmc", bus = FORGE)
public class ModWeaponEvents {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        //if (event.phase != TickEvent.Phase.END) return; testing if tick event system is working
        Player player = event.player;
        Level level = player.level();


        if (player.level().isClientSide) return;

        ItemStack stack = player.getMainHandItem();

        //Checking if player is holding a weapon
        if (!(stack.getItem() instanceof ModWeaponClassBuilder weapon)) return;

        //checking if right click is being held
        if (player.isUsingItem() && player.getUseItem() == stack) {


            if (!level.isClientSide){
                //System.out.println("hold fire working (event system)");
            }

            //fire rate control
            int useTime = player.getUseItemRemainingTicks();
            if (weapon instanceof ModShooterClass shooter) {
                    if (useTime % shooter.getStats().FireRateTicks == 0) {
                        shooter.fireWeapon(level, player, stack);
                    }
            }
        }
    }
}
