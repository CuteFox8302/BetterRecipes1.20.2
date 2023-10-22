package net.fennec.betterrecipes;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterRecipes implements ModInitializer {
	public static final String MOD_ID = "betterrecipes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Better Recipes loading...");
	}
}