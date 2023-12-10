package lessons1_20.homework14;

import java.util.Scanner;
import java.util.function.Predicate;

// Задача 2:
//Используя Predicate среди массива чисел вывести только те, которые являются
//положительными.
public class Task2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter array size (>0):");
        int m;
        do {
            m=in.nextInt();
        } while (m<0);
        double[] massDouble = new double[m];
        for (int i=0; i<m; i++) {
            System.out.println("enter element " + i);
            massDouble[i]=in.nextDouble();
        }
        Predicate<Double> isPositive=num -> num>0;
        System.out.println("printing positive numbers from array: ");
        for (int i=0; i<m; i++) {
            if (isPositive.test(massDouble[i])) {
                System.out.print(massDouble[i] + ", ");
            }
        }

    }
}
