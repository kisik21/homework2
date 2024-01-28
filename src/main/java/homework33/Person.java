package homework33;

public class Person {

    private int age;
    private String name;
    private String address;
    private int balance;

    Person (int age, String name, String address, int balance) {
        this.age=age;
        this.name=name;
        this.address=address;
        this.balance=balance;
    }
    public int getAge () {
        return this.age;
    }

    public String getName () {
        return this.name;
    }

    public String getAddress () {
        return this.address;
    }

    public int getBalance () {
        return this.age;
    }

    public void setName (String newName) {
        this.name=newName;
    }

    @Override
    public String toString() {
        return "Person{"
                + "Name='" + name + '\''
                + ", Age=" + age
                + ", Address=" + address
                + ", Balance=" + balance
                + '}';
    }
    @Override
    public int hashCode(){

        return 3 * name.hashCode() + 7 * age + 5 * address.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        homework33.Person person = (homework33.Person) o;

        if (getAge() != person.getAge()) {
            return false;
        }

        if (!getName().equals(person.getName())) {
            return false;
        }

        if (getBalance() != person.getBalance()) {
            return false;
        }
        return getAddress().equals(person.getAddress());

    }
}
