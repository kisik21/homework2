package lessons1_20.homework19;

import java.util.Scanner;

// Задача 2:
//Сортировка массива цифр в нескольких потоках различными алгоритмами:
//* сортировка вставками;
//* сортировка выбором;
//* сортировка пузырьком.
//Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
//результат отсортированных массивов в консоль.
public class Task2 {
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
        ArrSort thread1=new ArrSort(massInt,"insertion");
        ArrSort thread2=new ArrSort(massInt,"selection");
        ArrSort thread3=new ArrSort(massInt,"bubble");
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
