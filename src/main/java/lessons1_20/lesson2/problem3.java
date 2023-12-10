package lessons1_20.lesson2;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int k = n/100 + n/10%10 + n%10;
        System.out.println("sum of digits: " + k);
    }
}