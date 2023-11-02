package org.example;
import java.lang.Math;
import java.util.ArrayList;

public class Elevator {

    public int calculateTravelTime(ArrayList<String> floorsToVisit){
        int totalFloorsVisited = 0;

        for (int i = 0; i < floorsToVisit.size() - 1; i++) {
            totalFloorsVisited += Math.abs(Integer.parseInt(floorsToVisit.get(i)) - Integer.parseInt(floorsToVisit.get(i+1)));
        }

        return totalFloorsVisited * 10;
    }

}
