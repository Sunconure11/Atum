package com.teammetallurgy.atum.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockWall extends ItemBlock {

	public ItemBlockWall(int par1) {
		super(par1);
	}

	@Override
	public String getItemDisplayName(ItemStack stack) {
		return getItemStackDisplayName(stack);
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return ((BlockWalls) Block.blocksList[getBlockID()]).getLocalizedName(stack);
	}

}