package lessons1_20.homework19;

//Задача 1:
//Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
//потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
//вычислений возвращаются в метод main().

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("enter array size: ");
            n = in.nextInt();
            if (n<1) {
                System.out.println("incorrect input");
            }
        } while (n < 1);
        int[] massInt = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter " + (i + 1) + " element: ");
            massInt[i] = in.nextInt();
        }
        ArrMinMax thread1=new ArrMinMax(massInt, "min");
        ArrMinMax thread2=new ArrMinMax(massInt, "max");
        thread1.start();
        thread2.start();
        try {
            thread1.join(); // thread 1 and thread 2 finish work before we get result
            thread2.join();
        }
        catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("min element is: " + thread1.getResult());
        System.out.println("max element is: " + thread2.getResult());
    }
}
