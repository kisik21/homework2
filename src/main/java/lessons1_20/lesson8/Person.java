package lessons1_20.lesson8;

public class Person {
    public String name;
    int age;
    private char gender;
    Person(String name, int age, char gender) {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    char getGender() {
        return this.gender;
    }

}
