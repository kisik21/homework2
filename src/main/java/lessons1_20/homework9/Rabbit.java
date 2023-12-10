package lessons1_20.homework9;

public class Rabbit extends Animal{

    @Override
     public void voice() {
        System.out.println("*Rabbit sound");
    }

    @Override
    public void eat(String food) {
        if (food.equals("grass") || food.equals("carrot")) {
            System.out.println("Happy");
        } else {
            System.out.println("Unhappy");
        }
    }
}
