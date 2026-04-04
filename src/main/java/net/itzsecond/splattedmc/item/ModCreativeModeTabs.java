package net.itzsecond.splattedmc.item;

import net.itzsecond.splattedmc.SplattedMod;
import net.itzsecond.splattedmc.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SplattedMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPLATTED_TAB = CREATIVE_MODE_TABS.register("splatted_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLD_SCALE.get()))
                    .title(Component.translatable("creativetab.splattedmc.splatted_tab"))
                    .displayItems((itemDisplayPerameters, output) -> {
                        //Adding Items to Tab
                        output.accept(ModItems.GOLD_SCALE.get());
                        output.accept(ModItems.SILVER_SCALE.get());
                        output.accept(ModItems.ANCIENT_SALVAGE.get());
                        output.accept(ModItems.RAW_ANCIENT_SALVAGE.get());

                        //Adding Blocks to Tab
                        output.accept(ModBlocks.SQUID_CRATE.get());
                        output.accept(ModBlocks.GOLD_SCALE_BLOCK.get());
                        output.accept(ModBlocks.ANCIENT_SALVAGE_ORE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> SPLATTED_WEAPONS_TAB = CREATIVE_MODE_TABS.register("splatted_weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPLATTERSHOT_JR.get())) // placeholder Icon
                    .withTabsBefore(SPLATTED_TAB.getId()) // Sets the Base Splatted tab to come before weapons tab
                    .title(Component.translatable("creativetab.splattedmc.splatted_weapons_tab"))
                    .displayItems((itemDisplayPerameters, output) -> {
                        //Adding Items to Tab
                        output.accept(ModItems.SPLATTERSHOT_JR.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
