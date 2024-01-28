package homework33;

public class Main {
    public static void main(String[] args) {
        Person pers=new Person(19, "Max", "abc, St. 56", 400);
        System.out.println(pers);
        Person pers2=new Person(19, "Max", "abc, St. 56", 400);
        System.out.println(pers.equals(pers2));
        System.out.println(pers.hashCode());
        System.out.println(pers2.hashCode());
    }
}
