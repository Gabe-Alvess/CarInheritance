package Cars;

public class ElectricCar extends Car {
    private int battery;

    public ElectricCar() {
        this("NO_COLOR", 0, 0);
    }

    public ElectricCar(String color, int battery) {
        super(color);
        this.battery = battery;
    }

    public ElectricCar(String color, int speed, int battery) {
        super(color, speed);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void charge(int amount) {
        setBattery(amount);
    }

    @Override
    public void accelerate(int amount) {
        int newSpeed = super.getSpeed() + (amount + (battery/100));
        super.setSpeed(newSpeed);
    }

    @Override
    public void slow(int amount) {
        int newSpeed = super.getSpeed() - (amount + (battery/100));
        super.setSpeed(newSpeed);
    }

    @Override
    public String toString() {
        return "\nElectric car: " +
                super.toString() +
                "\nBattery power -> " + battery;
    }
}
