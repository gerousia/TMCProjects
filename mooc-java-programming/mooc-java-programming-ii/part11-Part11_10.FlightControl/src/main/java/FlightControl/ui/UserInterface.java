package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightLogic;

import java.util.Scanner;

public class UserInterface {
    private final FlightLogic flightLogic;
    private final Scanner in;

    public UserInterface(Scanner in) {
        this.in = in;
        this.flightLogic = new FlightLogic();
    }

    public void startAirportAssetControl() {
        while (true) {
            System.out.println("Airport Asset Control");
            printAssetControlCommands();
            String command = in.nextLine();

            switch (command.toLowerCase()) {
                case "1":
                    createAirplane();
                    break;
                case "2":
                    createFlight();
                    break;
                case "x":
                    return;
                default:
                    System.out.println("ERROR.");
                    break;
            }
        }
    }

    public void startFlightControl() {
        while (true) {
            System.out.println("Flight Control");
            printFlightControlCommands();
            String command = in.nextLine();

            switch (command.toLowerCase()) {
                case "1":
                    printAirplanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printAirplaneDetails();
                     break;
                case "x":
                    return;
                default:
                    System.out.println("ERROR.");
                    break;
            }
        }
    }

    private void printAssetControlCommands() {
        System.out.println("[1] Add an airplane");
        System.out.println("[2] Add a flight");
        System.out.println("[x] Exit Airport Asset Control");
        System.out.print(">");
    }

    private void printFlightControlCommands() {
        System.out.println("[1] Print airplanes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print airplane details");
        System.out.println("[x] Quit");
        System.out.print(">");
    }

    private void printAirplanes() {
        flightLogic.getAirplanes().forEach((k, v) -> System.out.println(v));
    }

    private void printFlights() {
        flightLogic.getFlights().forEach((k, v) -> System.out.println(v));
    }

    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        String airplaneID = in.nextLine();
        System.out.println(getAirplaneDetails(airplaneID));
    }

    private Airplane getAirplaneDetails(String airplaneID) {
        return flightLogic.getAirplanes().get(airplaneID);
    }

    private void createAirplane() {
        System.out.print("Give the airplane id: ");
        String airplaneID = in.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(in.nextLine());
        flightLogic.addAirplane(airplaneID, capacity);
    }

    private void createFlight() {
        System.out.print("Give the airplane id: ");
        String airplaneID = in.nextLine();
        Airplane airplane = flightLogic.getAirplanes().get(airplaneID);
        System.out.print("Give the departure airport id: ");
        String destinationID = in.nextLine();
        System.out.print("Give the target airport id: ");
        String departureID = in.nextLine();
        flightLogic.addFlight(airplane, destinationID, departureID);
    }

}
