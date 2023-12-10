package lessons1_20.lesson3;
//        Задача 1:
//        Напишите программу, которая будет принимать на вход число из консоли и на выход
//        будет выводить сообщение четное число или нет. Для определения четности числа
//        используйте операцию получения остатка от деления (операция выглядит так: '% 2').
//        Задача 2:
//        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//        Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
//        Задача 3:
//        Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
//        Задача 4:
//        Необходимо, чтоб программа выводила на экран вот такую последовательность:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
//        Задача *:
//        Напишите программу, где пользователь вводит любое целое положительное число. А
//        программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
//        числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
//        ввести некорректные данные.

import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = in.nextInt();
        if (a%2==0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        System.out.println("enter temperature:");
        double t = in.nextDouble();
        if (t>-5) {
            System.out.println("warm ");
        } else if (t<=-5 && t>-20) {
            System.out.println("normal");
        } else
            System.out.println("cold");

        for (int b=10; b<=20; b++) {
            System.out.print(b*b + " ");
        }
        System.out.println();
        int c=7;
        while (c<100) {
            System.out.print(c + " ");
            c+=7;
        }
        System.out.println();
        int d;
        do {
            System.out.print("enter a positive integer: ");
            d = in.nextInt();
        } while ( d<=0);
        int sum=0;
        for (;d>0;d--) {
            sum+=d;
        }
        System.out.println("sum: " + sum);
    }
}