package scythe.god;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScytheOfGods implements ModInitializer {
	public static final String MOD_ID = "ScytheOfGod";
    public static final Logger LOGGER = LoggerFactory.getLogger("scytheofgods");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}