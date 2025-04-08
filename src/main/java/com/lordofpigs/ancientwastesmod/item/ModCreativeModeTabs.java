package com.lordofpigs.ancientwastesmod.item;

import com.lordofpigs.ancientwastesmod.AncientWastesMod;
import com.lordofpigs.ancientwastesmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AncientWastesMod.MOD_ID);

    public static final Supplier<CreativeModeTab> TESSARITE_ITEMS_TAB = CREATIVE_MODE_TAB.register("tessarite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESSARITE.get()))
                    .title(Component.translatable("creativetab.ancientwastesmod.tessarite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TESSARITE);
                        output.accept(ModItems.RAW_TESSARITE);

                    }).build());

    public static final Supplier<CreativeModeTab> TESSARITE_BLOCK_TAB = CREATIVE_MODE_TAB.register("tessarite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TESSARITE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AncientWastesMod.MOD_ID, "tessarite_items_tab"))
                    .title(Component.translatable("creativetab.ancientwastesmod.tessarite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TESSARITE_BLOCK);
                        output.accept(ModBlocks.TESSARITE_ORE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
