package lessons1_20.homework13;

// Задача 2:
//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//объекта этого класса в main методе другого класса.
public class Task2 {
    public static void main(String[] args) {

        Animals animals = new Animals();
        animals.addAnimal("Dog");
        animals.addAnimal("Cat");
        animals.addAnimal("Fish");
        System.out.println(animals.removeAnimal()); // Dog removed
        System.out.println(animals.removeAnimal()); // Cat removed
        System.out.println(animals.removeAnimal()); // Fish removed

    }
}

