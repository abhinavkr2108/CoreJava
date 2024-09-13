package enums;

enum Laptop{
    Apple(2000),
    Dell(1800),
    Hp(1200),
    Lenovo(900);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Laptop[] laptops = Laptop.values();

        for (Laptop l: laptops){
            System.out.println(l+ " : $"+l.getPrice() );
        }
    }
}
