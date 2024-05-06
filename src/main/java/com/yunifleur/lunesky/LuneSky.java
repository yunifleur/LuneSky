package com.yunifleur.lunesky;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = LuneSky.MODID, version = LuneSky.VERSION)
public class LuneSky
{
    // declare constants
    public static final String MODID = "lunesky";
    public static final String VERSION = "1.2.4"; // change every release >yuni
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
