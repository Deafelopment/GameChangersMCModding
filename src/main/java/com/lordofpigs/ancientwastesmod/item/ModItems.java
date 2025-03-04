package com.lordofpigs.ancientwastesmod.item;

import com.lordofpigs.ancientwastesmod.AncientWastesMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AncientWastesMod.MOD_ID);

    public static final DeferredItem<Item> TESSARITE = ITEMS.register("tessarite",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
