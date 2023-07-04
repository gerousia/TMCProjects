package FlightControl.domain;

public class Flight {
    private final Airplane airplane;
    private final Place departure;
    private final Place destination;

    public Flight(Airplane airplane, Place departure, Place destination) {
        this.airplane = airplane;
        this.departure = departure;
        this.destination = destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return String.format("%s (%s-%s)", airplane, departure.getId(), destination.getId());
    }
}
