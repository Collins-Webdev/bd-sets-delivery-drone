package com.amazon.ata.hashingset;

import java.util.HashSet;
import java.util.Set;

public class DroneFleet {

    private Set<DeliveryDrone> drones;

    public DroneFleet() {
        drones = new HashSet<>();
    }

    public boolean addDrone(DeliveryDrone drone) {
        return drones.add(drone);
    }

    public boolean removeDrone(DeliveryDrone drone) {
        return drones.remove(drone);
    }

    public int getSize() {
        return drones.size();
    }

    public boolean containsDroneFromLocation(String locationCode) {
        for (DeliveryDrone drone : drones) {
            if (drone.getLocationCode().equals(locationCode)) {
                return true;
            }
        }
        return false;
    }
}