
package net.mcreator.dcdecorations.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.dcdecorations.block.WhiteBrick0Block;
import net.mcreator.dcdecorations.DcdecorationsModElements;

@DcdecorationsModElements.ModElement.Tag
public class DCWhiteItemGroup extends DcdecorationsModElements.ModElement {
	public DCWhiteItemGroup(DcdecorationsModElements instance) {
		super(instance, 200);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdc_white") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WhiteBrick0Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
