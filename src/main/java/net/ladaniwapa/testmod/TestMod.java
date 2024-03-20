package net.ladaniwapa.testmod;

import net.fabricmc.api.ModInitializer;

import net.ladaniwapa.testmod.block.ModBlocks;
import net.ladaniwapa.testmod.item.ModItemGroups;
import net.ladaniwapa.testmod.item.ModItems;
import net.minecraft.item.ItemConvertible;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemsGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}