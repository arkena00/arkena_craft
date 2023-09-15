package com.arkena;

import com.arkena.core.ArkenaItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArkenaMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("arkena");

	public static final Identifier SOUND_NOT_PREPARED = new Identifier("arkena:not_prepared");
	public static SoundEvent SOUNDEVENT_NOT_PREPARED = new SoundEvent(SOUND_NOT_PREPARED);

	@Override
	public void onInitialize() {

		LOGGER.info("Load ArkenaMod");

		ArkenaItems.register();
		Registry.register(Registry.SOUND_EVENT, SOUND_NOT_PREPARED, SOUNDEVENT_NOT_PREPARED);



		//ServerTickEvents.END_SERVER_TICK.register(new ServerTickCallback());
	}
}