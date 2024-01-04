package Practice33;

public class Task1 {
    public static void main(String[] args) {
        Cat cat1=new Cat("Bars", 4);
        Person person1 = new Person(20, "Stas", 55, cat1);
        System.out.println(person1);
        Person person2=person1;
        Person clone;
        try {
            clone = person1.clone();
            clone.setName("Imposter");
            System.out.println("clone:");
            System.out.println(clone);
            System.out.println(person1.equals(person2));
            System.out.println(person1.equals(clone));

        } catch (CloneNotSupportedException e) {
            System.out.println("Cant be cloned.");
        }


    }

}
