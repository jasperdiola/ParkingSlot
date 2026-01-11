package com.parkingSlot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parkingSlot.Model.ParkingSlotModel;
import com.parkingSlot.Service.ParkingSlotService;

@RestController()
@RequestMapping("/Parking")
public class ParkingSlotController {

    @Autowired
    private ParkingSlotService parkingSlotService;

    @GetMapping("getAll")
    public List<ParkingSlotModel> testing() {
        return parkingSlotService.getAllParkingSlot();
    }
    
    @GetMapping("/slot/{id}")
    public ParkingSlotModel getById(@PathVariable("id") int id) {
        return parkingSlotService.getById(id);
    }
}
