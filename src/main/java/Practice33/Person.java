package Practice33;

public class Person implements Cloneable{

    private int age;
    private String name;
    int salary;

    Cat cat;
    Person (int age, String name, int salary, Cat cat) {
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.cat=cat;
    }
    public int getAge () {
        return this.age;
    }

    public String getName () {
        return this.name;
    }
    public void setName (String newName) {
        this.name=newName;
    }

    @Override
    public String toString() {
        return "Person{"
                + "Name='" + name + '\''
                + ", Age=" + age
                + ", Salary=" + salary
                + '}'
                + "\n" + cat;
    }
    @Override
    public int hashCode(){

        return 3 * name.hashCode() + 5 * age + 2 * salary;
    }

    @Override
    public Person clone () throws CloneNotSupportedException {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (getAge() != person.getAge()) {
            return false;
        }
        return getName() != null
                ? getName().equals(person.getName())
                : person.getName() == null;

    }
}
