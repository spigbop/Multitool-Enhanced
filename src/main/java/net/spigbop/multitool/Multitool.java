package net.spigbop.multitool;

import net.fabricmc.api.ModInitializer;
import net.spigbop.multitool.item.MultitoolItemGroup;
import net.spigbop.multitool.item.MultitoolItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Multitool implements ModInitializer {
	public static final String MOD_ID = "multitool";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MultitoolItems.registerItems();
		MultitoolItemGroup.registerItemGroups();
	}
}
