package lessons1_20.practice15;

// Задача 1:
//Создать класс User с полем name. В Main создать поле user типа User. Заранее мы не
//знаем лежит там объект или отсутствует. Написать логику, которая будет выводить имя
//пользователя если объект присутствует в user, либо ‘DEFAULT’ в противном случае.
//Использовать класс Optional.

import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {

        Optional<User> user = Optional.of(new User("Stas"));
        //Optional<User> user = Optional.of(new User()); // DEFAULT
        String name = user.map(User::getName).orElse("DEFAULT").toString();
        System.out.println(name);
    }
}

