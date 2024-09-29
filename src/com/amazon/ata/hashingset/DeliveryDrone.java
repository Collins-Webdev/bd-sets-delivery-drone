package com.amazon.ata.hashingset;

import java.util.Objects;

public class DeliveryDrone {

    private String registrationNumber;
    private String locationCode;

    public DeliveryDrone(String registrationNumber, String locationCode) {
        this.registrationNumber = registrationNumber;
        this.locationCode = locationCode;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getLocationCode() {
        return locationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryDrone that = (DeliveryDrone) o;
        return Objects.equals(registrationNumber, that.registrationNumber) &&
                Objects.equals(locationCode, that.locationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, locationCode);
    }
}