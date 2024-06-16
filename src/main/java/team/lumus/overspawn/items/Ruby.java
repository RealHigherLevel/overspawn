package team.lumus.overspawn.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import team.lumus.overspawn.Overspawn;

public class Ruby extends Item {
    public Ruby() {
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName(Overspawn.MODID, "ruby");
    }
}
