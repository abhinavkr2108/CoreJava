package enums;

enum Status{
    Started,
    Progress,
    Pending,
    Success,
    Fail
}
public class Demo {
    public static void main(String[] args) {
        Status status = Status.Started;
        Status status1 = Status.Progress;

        System.out.println(status1);
        System.out.println(status);
        System.out.println(status.ordinal()); //index

        Status[] statuses = Status.values();
        for (Status s: statuses){
            System.out.println(s+" : " +s.ordinal());
        }
    }
}
