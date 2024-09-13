package MethodReference;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello","World","Java","Code");

        List<String> uNames = list.stream()
                .map(n->n.toUpperCase())
                .toList();

        System.out.println(uNames);

        List<String> caps = list.stream()
                .map(String::toUpperCase) //Method Reference
                .toList();
        System.out.println(caps);
    }
}
