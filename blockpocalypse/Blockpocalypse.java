package com.enderalex951.blockpocalypse;
import com.enderalex951.blockpocalypse.blocks.ModObeliskPillar;
import com.enderalex951.blockpocalypse.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.model.BlockModel;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("blockpocalypse")
public class Blockpocalypse
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "blockpocalypse";

    public Blockpocalypse() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(RegistryHandler.OBELISK_COLUMN_1.get(), RenderType.getCutoutMipped());

    }

    public static final ItemGroup TAB = new ItemGroup("blockpocalypseTab"){

        @Override
        public ItemStack createIcon(){
            return new ItemStack(RegistryHandler.TEST.get());
        }


    };


}
