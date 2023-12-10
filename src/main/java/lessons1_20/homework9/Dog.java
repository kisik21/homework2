package lessons1_20.homework9;

public class Dog extends Animal{

    @Override
     public void voice() {
        System.out.println("Bark");
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat") || food.equals("dog food")) {
            System.out.println("Happy");
        } else {
            System.out.println("Unhappy");
        }
    }
}
