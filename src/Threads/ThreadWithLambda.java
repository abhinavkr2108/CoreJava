package Threads;

public class ThreadWithLambda {
    public static void main(String[] args) {
        Runnable one = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("One");
                }
            }
        };

        Runnable two = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Two");
            }
        };

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);

        t1.start();
        t2.start();
    }
}
