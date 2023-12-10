package lessons1_20.lesson3;

import java.util.Scanner;
public class practice3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input  number from 1 to 12: ");
        int a = in.nextInt();
        switch (a) {
            case 1, 2, 12 -> System.out.println("winter");
            case 3, 4, 5 -> System.out.println("spring");
            case 6, 7, 8 -> System.out.println("summer");
            case 9, 10, 11 -> System.out.println("autumn");
            default -> System.out.println("invalid input ");
        }
        int i=0;
        while ( i<=25) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int k=2; k<=20; k++) {
            if ((k%2==0) & (k>10)) {
                System.out.println(k);
            }
        }
        System.out.println("Input amount of money: ");
        double s = in.nextInt();
        System.out.println("Input number of months: ");
        int m = in.nextInt();
        while (m>0) {
            s*=1.07;
            m--;
        }
        System.out.print("amount of money at the end: ");
        System.out.printf("%.0f",s);
        System.out.println();
        int u=0;
        while (u!=1) { // !"1".equals(u)
        System.out.println("Input first number : ");
        int n1 = in.nextInt();
        System.out.println("Input second number : ");
        int n2 = in.nextInt();
        System.out.println("result : " + n1*n2);
        System.out.println("press 1 to stop");
        u = in.nextInt();
        }
        System.out.println("Input height : ");
        int h = in.nextInt();
        System.out.println("Input width : ");
        int w = in.nextInt();

        for (; h>0;h--) {
            System.out.println();
            int t=w;
            for (; t>0; t--) {
                System.out.print("*");
            }
        }

    }
}