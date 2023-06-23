import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicle;

    public VehicleRegistry() {
        this.vehicle = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(!(vehicle.containsKey(licensePlate))) {
            vehicle.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return vehicle.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if(vehicle.containsKey(licensePlate)) {
            vehicle.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        vehicle.forEach((licensePlate, owner) -> {
            System.out.println(licensePlate);
        });
    }

    public void printOwners() {
        final Set<String> owners = new HashSet<>(vehicle.values());
        owners.forEach(System.out::println);
    }
}
