package InnerClass;

class School{
    String schoolName;

    public void show(){
        System.out.println("School Name");
    }
    static class Student{
        public void info(){
            System.out.println("Student Info");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        School school = new School();
        school.show();

        School.Student student = new School.Student();
        student.info();
    }
}
