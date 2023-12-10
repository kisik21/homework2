package lessons1_20.practice11;

public class TooYoung extends Exception{
    private int age;

    public  TooYoung(int age, String message) {
        super(message);
        this.age=age;
    }

}
