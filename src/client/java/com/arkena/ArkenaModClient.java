package com.arkena;

import com.arkena.core.ArkenaItems;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import static net.minecraft.server.command.CommandManager.literal;
import net.minecraft.text.Text;

public class ArkenaModClient implements ClientModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("arkena");

	@Override
	public void onInitializeClient() {

		LOGGER.info("arkena !");

		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("ark")
				.executes(context -> {
					context.getSource().sendMessage(Text.of(("ena")));
					return 1;
				})));

		LOGGER.info("Load ArkenaModClient");
	}
}