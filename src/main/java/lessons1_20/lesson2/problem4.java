package lessons1_20.lesson2;

import java.util.Scanner;
import java.lang.Math;
public class problem4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double n = in.nextDouble(); //separate input by ","
        double a = Math.round(n);
        System.out.println("rounded number: " + a);

        System.out.printf("%.0f",n); // second way
    }
}