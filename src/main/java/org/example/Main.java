package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter elevator, starting floor and a list of floors to visit with the" +
                " example request: elevator start=12 floor=2,9,1,32");

        Scanner scanner = new Scanner(System.in);
        String inputPattern = "elevator start=(\\d+) floor=([\\d,]+)";
        Pattern regex = Pattern.compile(inputPattern);

        boolean isValidSyntax = false;
        ArrayList<String> listOfFloors = new ArrayList<>();

        do {
            String userInput = scanner.nextLine();

            Matcher matcher = regex.matcher(userInput);

            if (matcher.matches()) {
                // add starting floor to array list
                listOfFloors.add(matcher.group(1));
                // add all floors to visit to array list
                listOfFloors.addAll(Arrays.asList(matcher.group(2).split(",")));
                isValidSyntax = true;

            } else {
                System.out.println("Sorry, that input is invalid. Please follow 'elevator start=(your starting floor)" +
                        " floor=(floors separated by comma) syntax.");
            }

        } while (!isValidSyntax);

        scanner.close();

        Elevator firstElevator = new Elevator();
        final String moveTime = Integer.toString(firstElevator.calculateTravelTime(listOfFloors));
        System.out.println(moveTime + " " + listOfFloors);

    }
}