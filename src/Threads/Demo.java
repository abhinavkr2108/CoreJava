package Threads;

class First extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 150; i++) {
            System.out.println("First Class");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Second extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 150; i++) {
            System.out.println("Second Class");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();

        first.start();
        second.start();
    }
}
