package Interface;

interface Computer{
    void code();
    void createDocs();
}

class Desktop implements Computer{
    @Override
    public void code() {
        System.out.println("Code on desktop");
    }

    @Override
    public void createDocs() {
        System.out.println("Desktop MS Apps");
    }
}

class Laptop implements Computer{
    @Override
    public void code() {
        System.out.println("Code on laptop");
    }

    @Override
    public void createDocs() {
        System.out.println("Laptop MS Apps");
    }
}

class Developer{
    void writeCode(Computer computer){
        computer.code();
    }
    void createDocs(Computer computer){
        computer.createDocs();
    }
}
public class Importance {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer dev = new Developer();
        dev.writeCode(desk);
        dev.createDocs(lap);

    }
}
