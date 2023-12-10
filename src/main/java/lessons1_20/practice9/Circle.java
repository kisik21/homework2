package lessons1_20.practice9;

public class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("I draw Circle");
    }

    @Override
    public void erase() {
        System.out.println("I erase Circle");
    }
}
