package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ElevatorTest {

    @Test
    @DisplayName("Calculate elevator travel time from start to all listed floors")
    void calculateTravelTime() {
        Elevator elevator = new Elevator();

        ArrayList<String> emptyFloors = new ArrayList<>();

        // Test no floors
        assertEquals(0, elevator.calculateTravelTime(emptyFloors));

        // Test single floor
        ArrayList<String> singleFloor = new ArrayList<>();
        singleFloor.add("5");
        assertEquals(0, elevator.calculateTravelTime(singleFloor));

        // Test multiple floors
        ArrayList<String> aboveGroundFloors = new ArrayList<>();
        aboveGroundFloors.add("5");
        aboveGroundFloors.add("6");
        aboveGroundFloors.add("2");
        aboveGroundFloors.add("8");
        aboveGroundFloors.add("5");

        /* Total floors visited: ABS(5-6) + ABS(6-2) + ABS(2-8) + ABS(8-5) = 1 + 4 + 6 + 3 = 14
        // 14 * 10 = 140
        Total travel time: 140
        */
        assertEquals(140, elevator.calculateTravelTime(aboveGroundFloors));

        // Test multiple floors
        ArrayList<String> basementFloors = new ArrayList<>();
        basementFloors.add("-3");
        basementFloors.add("7");
        basementFloors.add("-1");

        /* Total floors visited: ABS(-3-7) + ABS(7-(-1)) = 10 + 8 = 18
        // 18 * 10 = 180
        Total travel time: 180
        */
        assertEquals(180, elevator.calculateTravelTime(basementFloors));
    }
}