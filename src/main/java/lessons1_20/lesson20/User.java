package lessons1_20.lesson20;

public class User {
    int id;
    String name;
    int age;
    String city;

    User (int id, String name, int age, String city) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.city=city;
    }

    String getInfo() {
        return this.id + " " + this.name + " " + this.age + " " + this.city;
    }
}
