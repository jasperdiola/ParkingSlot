package com.parkingSlot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.parkingSlot.Exception.ParkingSlotNotFoundException;
import com.parkingSlot.Model.ParkingSlotModel;
import com.parkingSlot.Model.ParkingSlotModel.Status;

@Service
public class ParkingSlotService {
    
    private final ArrayList<ParkingSlotModel> parkingSlot = new ArrayList<>(List.of(new ParkingSlotModel("A1", Status.OCCUPIED, "1234"),
    new ParkingSlotModel("A2", Status.OCCUPIED, "4567"),
    new ParkingSlotModel("A3", Status.OCCUPIED, "8901"),
    new ParkingSlotModel("A4", Status.OCCUPIED, "2345")));

    public ParkingSlotModel getById(int id) {
        try {
            return parkingSlot.get(id);
        } catch (Exception e) {
            throw new ParkingSlotNotFoundException(Long.valueOf(id));
        }
    }

    public ArrayList<ParkingSlotModel> getAllParkingSlot() {
        return parkingSlot;
    }
}
