package com.parkingSlot.Exception;

public class ParkingSlotNotFoundException extends RuntimeException {
    public ParkingSlotNotFoundException(Long id) {
        super("Parking slot with id " + id + " not found");
    }
}
