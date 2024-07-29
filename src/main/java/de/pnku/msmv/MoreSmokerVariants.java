package de.pnku.msmv;

import de.pnku.msmv.init.MsmvBlockInit;
import de.pnku.msmv.init.MsmvItemInit;
import de.pnku.msmv.init.MsmvMfvItemInit;
import de.pnku.msmv.poi.MsmvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreSmokerVariants implements ModInitializer {
    public static final String MODID = "quad-lolmsmv";
    public static boolean isMfvLoaded = false;
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().isModLoaded("lolmfv")) {
            isMfvLoaded = true;
            LOGGER.info("MSMV:\"MFV loaded.\"");
        }
        if (isMfvLoaded) { MsmvBlockInit.registerSmokerBlocks(); } else { MsmvBlockInit.registerCobblestoneSmokerBlocks();}
        MsmvItemInit.registerSmokerItems();
        if (isMfvLoaded) {    MsmvMfvItemInit.registerMfvSmokerItems();}
        MsmvPointOfInterestTypes.init();
    }

    public static ResourceLocation asId(String path) {
        return new ResourceLocation(MODID, path);
    }
}