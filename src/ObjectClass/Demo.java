package ObjectClass;

import java.util.Objects;

// Every class by default extends Object class
public class Demo {
    static class Laptop{
        String model;
        int price;

        @Override
        public String toString(){
            return "Laptop Name: "+ model +" Price: "+price;
        }

        public boolean equals(Laptop obj) {
            return Objects.equals(this.model, obj.model) && this.price == obj.price;
        }
    }
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.model = "Dell";
        laptop1.price = 50000;

        Laptop laptop2 = new Laptop();
        laptop2.model = "Dell";
        laptop2.price = 50000;

        System.out.println(laptop1);
        System.out.println(laptop2);
        Boolean res = laptop1.equals(laptop2);
        System.out.println(res);

    }
}

