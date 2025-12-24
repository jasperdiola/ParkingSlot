package com.parkingSlot.Model;

import org.springframework.stereotype.Component;

// import jakarta.persistence.Entity;
// import jakarta.persistence.EnumType;
// import jakarta.persistence.Enumerated;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
// @Entity
// @Table(name = "parkingSlot")
public class ParkingSlotModel {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String slotNumber;

    // @Enumerated(EnumType.STRING)
    private Status status;

    private String vehiclePlate;

    public ParkingSlotModel(String slotNumber, Status status, String vehiclePate) {
        this.slotNumber = slotNumber;
        this.status = status;
        this.vehiclePlate = vehiclePate;
    }

    public enum Status {
        AVAILABLE,
        OCCUPIED
    }
}
