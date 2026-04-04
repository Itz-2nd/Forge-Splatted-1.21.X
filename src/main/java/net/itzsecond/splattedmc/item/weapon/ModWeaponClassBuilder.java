package net.itzsecond.splattedmc.item.weapon;

import net.itzsecond.splattedmc.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Properties;

public class ModWeaponClassBuilder extends Item {

    public ModWeaponClassBuilder(Properties properties) {
        super(properties);
    }

    //For right Click input:

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        //System.out.println(this.getClass().getName());  testing if weapon is in main hand

        ItemStack item = player.getItemInHand(hand);

        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("Weapon Fired!"));
        }

        return InteractionResultHolder.sidedSuccess(item, level.isClientSide());
    }

}
