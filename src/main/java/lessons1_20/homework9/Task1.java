package lessons1_20.homework9;

public class Task1 {
    public static void main(String[] args) {



    Animal rabbit = new Rabbit();
    Animal tiger = new Tiger();
    Animal dog = new Dog();
    rabbit.eat("grass");
    dog.eat("carrot");
    tiger.eat("meat");
    rabbit.voice();
    dog.voice();
    tiger.voice();
    }
}
