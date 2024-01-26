package net.PilotsPitstop.RaptorProject.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

public static final ItemGroup RAPTOR_PROJECT = new ItemGroup("raptorProjectTab")
{
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ModItems.PENJAMIN.get());
    }
};

}
