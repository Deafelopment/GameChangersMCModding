package com.lordofpigs.ancientwastesmod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class ChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    Blocks.STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS,
                    Blocks.COBBLED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE,
                    Blocks.NETHER_BRICKS, Blocks.CHISELED_NETHER_BRICKS,
                    Blocks.BOOKSHELF, Blocks.CHISELED_BOOKSHELF,
                    Blocks.POLISHED_BLACKSTONE, Blocks.CHISELED_POLISHED_BLACKSTONE,
                    Blocks.QUARTZ_BLOCK, Blocks.CHISELED_QUARTZ_BLOCK,
                    Blocks.SANDSTONE, Blocks.CHISELED_SANDSTONE,
                    Blocks.RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE,
                    Blocks.TUFF, Blocks.CHISELED_TUFF,
                    Blocks.TUFF_BRICKS, Blocks.CHISELED_TUFF_BRICKS
            );

    public ChiselItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();



        return super.useOn(context);
    }
}
