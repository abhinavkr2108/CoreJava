package Interface;

@java.lang.FunctionalInterface
interface NewCar{
    void drive();
}

class Honda implements NewCar{
    @Override
    public void drive() {
        System.out.println("Driving Honda Car...");
    }
}
public class FunctionalInterface {
    public static void main(String[] args) {
        NewCar honda = new Honda();
        honda.drive();

        NewCar maruti = new NewCar() {
            @Override
            public void drive() {
                System.out.println("Driving Maruti Car...");
            }
        };

        maruti.drive();
    }
}
