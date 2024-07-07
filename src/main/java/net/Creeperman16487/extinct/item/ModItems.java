package net.Creeperman16487.extinct.item;

import net.Creeperman16487.extinct.ExtinctMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtinctMod.MOD_ID);

    public static final RegistryObject<Item> DNA = ITEMS.register("dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RNA = ITEMS.register("rna",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
