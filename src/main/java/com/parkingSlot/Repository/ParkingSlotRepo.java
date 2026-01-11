package com.parkingSlot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parkingSlot.Model.ParkingSlotModel;

@Repository
public interface ParkingSlotRepo extends JpaRepository<ParkingSlotModel,Integer> {
    
}
