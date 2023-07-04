package FlightControl.logic;

import FlightControl.domain.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightLogic {
    private final Map<String, Airplane> airplanes;
    private final Map<String, Flight> flights;
    private final Map<String, Place> places;

    public FlightLogic() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String airplaneID, int capacity) {
        this.airplanes.put(airplaneID, new Airplane(airplaneID, capacity));
    }

    public void addFlight(Airplane airplane, String departureID, String destinationID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(airplane, places.get(departureID), places.get(destinationID));
        this.flights.putIfAbsent(flight.toString(), flight);
    }

    public Map<String, Airplane> getAirplanes() {
        return airplanes;
    }

    public Map<String, Flight> getFlights() {
        return flights;
    }

    public Map<String, Place> getPlaces() {
        return places;
    }
}
