package lessons1_20.homework13;

import java.util.LinkedList;
public class Animals {
    private final LinkedList<String> animals = new LinkedList<>();
    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }
    public String removeAnimal() {
        return animals.removeLast() + " removed";
    }

}