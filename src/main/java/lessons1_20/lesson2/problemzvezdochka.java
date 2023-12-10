package lessons1_20.lesson2;

import java.util.Scanner;
public class problemzvezdochka {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number : ");
        int b = in.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }
}