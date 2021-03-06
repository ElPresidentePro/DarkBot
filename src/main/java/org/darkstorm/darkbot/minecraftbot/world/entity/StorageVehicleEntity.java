package org.darkstorm.darkbot.minecraftbot.world.entity;

import org.darkstorm.darkbot.minecraftbot.MinecraftBot;
import org.darkstorm.darkbot.minecraftbot.event.protocol.client.EntityUseEvent;
import org.darkstorm.darkbot.minecraftbot.world.World;

public abstract class StorageVehicleEntity extends VehicleEntity {

	public StorageVehicleEntity(World world, int id) {
		super(world, id);
	}

	public void open() {
		MinecraftBot bot = world.getBot();
		bot.getEventBus().fire(new EntityUseEvent(this));
	}
}
