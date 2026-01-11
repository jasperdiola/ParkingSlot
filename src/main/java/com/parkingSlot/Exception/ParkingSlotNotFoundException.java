package com.parkingSlot.Exception;

public class ParkingSlotNotFoundException extends RuntimeException {
    public ParkingSlotNotFoundException(int id) {
        super("Parking slot with id " + id + " not found");
    }
}
