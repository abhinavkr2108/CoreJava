package ConstructorReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CodeLanguage{
    private String name;
    private int age;

    public CodeLanguage(){}
    public CodeLanguage(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CodeLanguage{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo {
    public static void main(String[] args) {
        List<String> codes = Arrays.asList("Java","C","Python","Javascript");
        List<CodeLanguage> list = new ArrayList<>();
        List<CodeLanguage> sList = new ArrayList<>();

       list= codes.stream()
                .map(c->new CodeLanguage(c))
                .toList();

       sList = codes.stream()
               .map(CodeLanguage::new)
               .toList();

        System.out.println(list);
        System.out.println(sList);
    }
}
