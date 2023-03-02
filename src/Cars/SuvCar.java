package Cars;

public class SuvCar extends Car {
    private boolean bullbar;
    private boolean is4x4DrivingOn;

    public SuvCar() {
        this("NO_COLOR", 0, 200);
    }
    public SuvCar(String color) {
        super(color);
    }
    public SuvCar(String color, int hp) {
        super(color, hp);
    }

    public SuvCar(String color, int speed, int hp) {
        super(color, speed, hp);
    }

    public boolean getBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public boolean isIs4x4DrivingOn() {
        return is4x4DrivingOn;
    }

    public void setIs4x4DrivingOn(boolean is4x4DrivingOn) {
        this.is4x4DrivingOn = is4x4DrivingOn;
    }

    @Override
    public void accelerate(int amount) {
        int newSpeed = super.getSpeed() + (amount + (getHp()/100));
        super.setSpeed(newSpeed);

        if (is4x4DrivingOn && super.getSpeed() > 30) {
            super.setSpeed(30);
        }
    }

    @Override
    public String toString() {
        return "\nSuv car: " +
                super.toString() +
                "\nHas a bullbar? -> " + (bullbar ? "yes" : "no") +
                "\nIs 4x4 on? -> " + (is4x4DrivingOn ? "yes" : "no");
    }
}
