package lesson30.Builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .name("Petr")
                .age(27)
                .address("ul. Pushkina 3")
                .build();
        System.out.println(person);

    }
}