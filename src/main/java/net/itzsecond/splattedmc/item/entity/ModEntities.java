package net.itzsecond.splattedmc.item.entity;

import net.itzsecond.splattedmc.item.weapon.projectile.InkProjectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "splattedmc");

    public static final RegistryObject<EntityType<InkProjectile>> INK_PROJECTILE =
            ENTITIES.register("ink_projectile",
                    () -> EntityType.Builder.<InkProjectile>of(InkProjectile::new, MobCategory.MISC)
                            .sized(0.25f, 0.25f)
                            .clientTrackingRange(4)
                            .updateInterval(10)
                            .build("ink_projectile"));


}
