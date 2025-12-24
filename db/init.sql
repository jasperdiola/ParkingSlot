-- Create the table for parking slots
CREATE TABLE IF NOT EXISTS parking_slot (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    slot_number VARCHAR(10) NOT NULL UNIQUE,
    status ENUM('AVAILABLE', 'OCCUPIED') NOT NULL,
    vehicle_plate VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert some mock data
INSERT INTO parking_slot (slot_number, status, vehicle_plate) VALUES
('A1', 'AVAILABLE', NULL),
('A2', 'OCCUPIED', 'ABC-123'),
('B1', 'AVAILABLE', NULL),
('B2', 'OCCUPIED', 'XYZ-789');
