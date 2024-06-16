package team.lumus.overspawn;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Overspawn.MODID, name = Overspawn.NAME, version = Overspawn.VERSION)
public class Overspawn
{
    public static final String MODID = "overspawn";
    public static final String NAME = "OverSpawn";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        logger = e.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {

    }
}
