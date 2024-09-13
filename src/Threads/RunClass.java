package Threads;

class One implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("One");
        }
    }
}

class Two implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Two");
        }
    }
}
public class RunClass {
    public static void main(String[] args) {

        Runnable one = new One();
        Runnable two = new Two();

        /*
        Start method don't work with runnable
         */

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);

        t1.start();
        t2.start();
    }
}
