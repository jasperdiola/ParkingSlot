package com.parkingSlot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingSlot.Exception.ParkingSlotNotFoundException;
import com.parkingSlot.Model.ParkingSlotModel;
import com.parkingSlot.Repository.ParkingSlotRepo;

@Service
public class ParkingSlotService {

    @Autowired
    ParkingSlotRepo repo;

    public ParkingSlotModel getById(int id) {
        return repo.findById(id).orElseThrow(() -> new ParkingSlotNotFoundException(id));
    }

    public List<ParkingSlotModel> getAllParkingSlot() {
        return repo.findAll();
    }
}
