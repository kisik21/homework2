package lessons1_20.lesson6;

public class Calculator {
    int weight=10;
    double cost=50.0;
    String color="yellow";
    public int sum (int x, int y) {
        return x+y;
    }
    public double sum (int x, double y) {
        return x+y;
    }
    public double sum (double x, int y) {
        return x+y;
    }
    public double sum (double  x, double y) {
        return x+y;
    }
    public String sum (String x, String y) {
        x=x.concat(y);
        return x;
    }
    public void sum () {
        System.out.println("no input");
    }

    public int dif (int x, int y) {
        return x-y;
    }
    public double dif (int x, double y) {
        return x-y;
    }
    public double dif (double x, int y) {
        return x-y;
    }
    public double dif (double  x, double y) {
        return x-y;
    }
    public void dif () {
        System.out.println("no input");
    }


}
