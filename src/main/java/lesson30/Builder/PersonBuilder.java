package lesson30.Builder;

public class PersonBuilder {
    private String name;
    private int age;
    private String address;
    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }
    public Person build() {
        return new Person(name, age, address);
    }
}