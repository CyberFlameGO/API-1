package org.cloudburstmc.api.event.vehicle;

import org.cloudburstmc.api.entity.Entity;
import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.server.player.Player;

public class EntityExitVehicleEvent extends VehicleEvent implements Cancellable {

    private final Entity riding;

    public EntityExitVehicleEvent(Entity riding, Entity vehicle) {
        super(vehicle);
        this.riding = riding;
    }

    public Entity getEntity() {
        return riding;
    }

    public boolean isPlayer() {
        return riding instanceof Player;
    }

}
