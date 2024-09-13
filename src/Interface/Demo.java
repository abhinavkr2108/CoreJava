package Interface;

interface Car{
    void drive(); // no need to write public abstract (default)
    void playMusic();
    int wheels=4; // Variables default static and final
    String name="Maruti";
}
 interface Bike{
    void ride();
 }

class Maruti implements Car,Bike{
    @Override
    public void drive() {
        System.out.println("Maruti Drive");
    }

    @Override
    public void playMusic() {
        System.out.println("Maruti Music System");
    }

    @Override
    public void ride() {
        System.out.println("Bike Ride");
    }
}
public class Demo {
    public static void main(String[] args) {
        Car maruti = new Maruti();
        maruti.drive();
        maruti.playMusic();
//        maruti.ride();

        System.out.println(Car.name);
        System.out.println(Car.wheels);
    }
}
