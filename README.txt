Elevator Travel Time Calculator

This program calculates the travel time of an elevator based on the list of floors it needs to visit from a starting
floor. The Elevator class contains a method calculateTravelTime that takes a list of floor numbers as input and returns
the total travel time in seconds.

Installation

    git clone https://github.com/c-sloan/Elevator-Chace.git

Usage

    To run the program an executable jar has been provided in out/artifacts/Elevator_Chace_jar/Elevator-Chace.jar

    Command to run from command line or terminal with JDK 17+ installed: java -jar "local path to jar file"

    Example input: elevator start=12 floor=2,9,1,32

Tests

To run these tests, ensure you have JUnit 5 set up in your development environment. Execute the test cases to verify the
correctness of the calculateTravelTime method in the Elevator class.

Feel free to modify the test cases or the Elevator class as needed to adapt to your specific requirements.

Assumptions
    1.) There's only a single elevator in operation
    2.) There are no additional elevator requests coming through while the elevator is operating
    3.) The floors are traversed in the order given, travel time does not need to be improved
    4.) Traveling between the same floors has no travel time
    5.) Array length and floors provided won't exceed max size limits

Features to add:
    1.) Improve elevator travel time by sorting floors to visit
    2.) Add support for requests made inside an elevator
    3.) Support multiple and subsequent requests
    4.) Add additional elevators and shared communication between them