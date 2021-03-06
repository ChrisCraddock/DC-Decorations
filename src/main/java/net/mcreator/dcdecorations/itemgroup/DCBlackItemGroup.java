
package net.mcreator.dcdecorations.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.dcdecorations.block.BasicBrick0Block;
import net.mcreator.dcdecorations.DcdecorationsModElements;

@DcdecorationsModElements.ModElement.Tag
public class DCBlackItemGroup extends DcdecorationsModElements.ModElement {
	public DCBlackItemGroup(DcdecorationsModElements instance) {
		super(instance, 201);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdc_black") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BasicBrick0Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
