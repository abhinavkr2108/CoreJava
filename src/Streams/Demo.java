package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> s1 = list.stream();
        s1.filter(n->{
           return n%2==0;
        }).forEach(n -> System.out.println(n));

    }
}
