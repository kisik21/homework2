package lessons1_20.lesson2;

import java.util.Scanner;
public class problem5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int q = in.nextInt();
        System.out.print("Input second number : ");
        int w = in.nextInt();
        System.out.println(q/w + ", ostatok " + q%w);
    }
}