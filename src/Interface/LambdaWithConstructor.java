package Interface;

@java.lang.FunctionalInterface
interface Phone{
    void display(String name);
}
interface Add{
    int sum(int i, int j);
}
public class LambdaWithConstructor {
    public static void main(String[] args) {
        Phone apple = new Phone() {
            @Override
            public void display(String name) {
                System.out.println("This is "+name+ " phone");
            }
        };
        Phone samsung = (name) -> System.out.println("This is "+name+ " phone");

        apple.display("apple");

        samsung.display("samsung");

        Add add = new Add() {
            @Override
            public int sum(int i, int j) {
                return i+j;
            }
        };

        int sum1=add.sum(5,4);
        System.out.println(sum1);

        Add intSum = (i,j) -> i+j;
        System.out.println(intSum.sum(3,7));

    }
}
