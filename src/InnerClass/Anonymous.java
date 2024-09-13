package InnerClass;

class Phone{
    public void showPhone(){
        System.out.println("Show Phone");
    }
}
class Samsung extends Phone{
    public void showPhone(){
        System.out.println("Samsung Phone");
    }
}
public class Anonymous {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone samsung = new Samsung();

        phone.showPhone();
        samsung.showPhone();

        //Method 2
        Phone phone2 = new Phone(){
            public void showPhone(){
                System.out.println("Show Phone (Phone 2)");
            }
        };
        phone2.showPhone();
    }
}
