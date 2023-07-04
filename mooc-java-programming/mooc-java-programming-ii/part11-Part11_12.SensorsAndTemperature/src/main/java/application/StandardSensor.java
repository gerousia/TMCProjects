package application;

public class StandardSensor implements Sensor {
    private boolean state;
    private final int number;

    public StandardSensor(int number) {
        this.state = true;
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {}

    @Override
    public void setOff() {}

    @Override
    public int read() {
        return this.number;
    }
}
