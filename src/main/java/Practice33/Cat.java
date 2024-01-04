package Practice33;

public class Cat {
    String name;
    int age;
    Cat (String name,int  age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Cat{"
                + "Name='" + name + '\''
                + ", Age=" + age
                + '}';
    }
}
