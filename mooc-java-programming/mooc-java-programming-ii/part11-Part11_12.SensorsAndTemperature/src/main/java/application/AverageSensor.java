package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensors;
    private final List<Integer> degrees;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.degrees = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        return sensors.stream()
                .allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        int reading = (int) sensors.stream()
                .mapToInt(Sensor::read)
                .average()
                .orElse(0);

        degrees.add(reading);
        return reading;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return degrees;
    }
}
