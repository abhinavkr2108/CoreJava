package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhinav","Hello", "John","Dhruv");
        String name1 = names.stream()
                .filter(s -> s.contains("b"))
                .findFirst()
                .orElse("Not Found");

        Optional<String> name2 = names.stream()
                .filter(s -> s.contains("x"))
                .findFirst();


        System.out.println(name1);
        System.out.println(name2.orElse("Not Found"));
    }
}
