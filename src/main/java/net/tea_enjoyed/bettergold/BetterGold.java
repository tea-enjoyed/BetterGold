package net.tea_enjoyed.bettergold;

import net.fabricmc.api.ModInitializer;
import net.tea_enjoyed.bettergold.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterGold implements ModInitializer {
	public static final String MOD_ID = "bettergold";
	public static final Logger LOGGER = LoggerFactory.getLogger("bettergold");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
