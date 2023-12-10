package lessons1_20.practice11;

public class Person  {
    int age;
    String name;
    Person(int age, String name) throws TooYoung {
        if (age<18) {
            throw new TooYoung(age, "cant create person younger than 18");
        }
        this.age=age;
        this.name=name;

    }

    public String talk() {
        return "Hi";
    }
    Person(String name) {
        this.name=name;

    }
}
