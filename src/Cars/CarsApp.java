package Cars;

public class CarsApp {
    public static void main(String[] args) {

        SuvCar suv = new SuvCar("red", 250);
        CabrioCar cabrio = new CabrioCar("yellow", 200);
        ElectricCar electricCar = new ElectricCar("green", 60);

        suv.accelerate(50);
        cabrio.accelerate(50);
        electricCar.accelerate(50);

        System.out.println(
                "Current suv car speed: " + suv.getSpeed() +
                "\nCurrent cabrio car speed: " + cabrio.getSpeed() +
                "\nCurrent electric car speed: " + electricCar.getSpeed()
        );

        Car[] carArray = {suv, cabrio, electricCar};

        for (Car c : carArray) {
            c.park(2000);
        }

        System.out.println(suv + "\n" + cabrio + "\n" + electricCar);

//        System.out.println(suv);
//        System.out.println(cabrio);
//        System.out.println(electricCar);
    }
}
