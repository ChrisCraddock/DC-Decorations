
package net.mcreator.dcdecorations.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.dcdecorations.block.Server2TopBlock;
import net.mcreator.dcdecorations.DcdecorationsModElements;

@DcdecorationsModElements.ModElement.Tag
public class DCDecorationsItemGroup extends DcdecorationsModElements.ModElement {
	public DCDecorationsItemGroup(DcdecorationsModElements instance) {
		super(instance, 199);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdc_decorations") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Server2TopBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
