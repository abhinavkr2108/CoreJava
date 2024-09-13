package Interface;

interface Book{
    void name();
}

class MathsBook implements Book{
    @Override
    public void name() {
        System.out.println("Maths Book");
    }
}
public class LambdaExpression {
    public static void main(String[] args) {
        MathsBook book = new MathsBook();
        book.name();

        Book cs = new Book() {
            @Override
            public void name() {
                System.out.println("CS BOOK");
            }
        };

        //Lambda Expression
        Book sst = () -> {
            System.out.println("SST BOOK");
        };

        cs.name();
        sst.name();
    }
}
