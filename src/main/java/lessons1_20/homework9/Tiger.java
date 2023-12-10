package lessons1_20.homework9;

public class Tiger extends Animal{

    @Override
     public void voice() {
        System.out.println("Rrr");
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat")) {
            System.out.println("Happy");
        } else {
            System.out.println("Unhappy");
        }
    }
}
