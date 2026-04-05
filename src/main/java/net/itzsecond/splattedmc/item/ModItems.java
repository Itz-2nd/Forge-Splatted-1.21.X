package net.itzsecond.splattedmc.item;

import net.itzsecond.splattedmc.SplattedMod;
import net.itzsecond.splattedmc.item.weapon.ModShooterClass;
import net.itzsecond.splattedmc.item.weapon.shooter.SplatterShotJr;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SplattedMod.MOD_ID);


    public static final RegistryObject<Item> GOLD_SCALE = ITEMS.register("gold_scale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SCALE = ITEMS.register("silver_scale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ANCIENT_SALVAGE = ITEMS.register("raw_ancient_salvage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_SALVAGE = ITEMS.register("ancient_salvage",
            () -> new Item(new Item.Properties()));

    //Weapons
    //Shooter Class Weapons
    public static final RegistryObject<Item> SPLATTERSHOT_JR = ITEMS.register("splattershot_jr",
            () -> new SplatterShotJr(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
