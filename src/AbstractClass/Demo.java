package AbstractClass;

abstract class Car{
    public abstract void drive();
}
public class Demo {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("Drive Car");
            }
        };
        car.drive();
    }

}
