package lessons1_20.lesson6;
import java.util.Scanner;
public class practice6_t1 {
    private int x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc1=new Calculator();
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        double b = sc.nextDouble();

        System.out.println("result (sum): " + calc1.sum(a, b));
        System.out.println("sum of strings: " + calc1.sum("str1", "str2"));
        System.out.println("weight: " + calc1.weight);
        System.out.println("cost: " + calc1.cost);
        System.out.println("color: " + calc1.color);

        System.out.println("enter first number: ");
        double c = sc.nextDouble();
        System.out.println("enter second number: ");
        double d = sc.nextDouble();
        System.out.println("result (dif): " + calc1.dif(c, d));

    }
}
