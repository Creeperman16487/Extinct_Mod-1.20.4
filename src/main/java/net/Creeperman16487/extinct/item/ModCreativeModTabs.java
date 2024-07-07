package net.Creeperman16487.extinct.item;

import net.Creeperman16487.extinct.ExtinctMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtinctMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXTINCT_TAB = CREATIVE_MODE_TABS.register("extinct_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DNA.get()))
                    .title(Component.translatable("creativetab.extinct_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DNA.get());
                        output.accept(ModItems.RNA.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
