package Cars;

public class Car {
    private String color;
    private int speed;
    private int hp;

    public Car() {
        this("NO_COLOR", 0, 200);
    }
    public Car(String color) {
        this.color = color;
    }
    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }
    public Car(String color, int speed, int hp) {
        this.color = color;
        this.speed = speed;
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int amount) {
        int newSpeed = this.speed + (amount + (hp/100));
         setSpeed(newSpeed);
    }

    public void slow(int amount) {
        int newSpeed = this.speed - (amount + (hp/100));
        setSpeed(newSpeed);
    }

    public void park(int amount) {
        speed = 0;
    }

    @Override
    public String toString() {
        return "\nColor -> " + color +
               "\nSpeed -> " + speed +
               "\nHorse power -> " + hp;
    }
}
