package lessons1_20.lesson4;

import java.util.Scanner;
public class homework4 {
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

        int[] massInt = new int[n];
        int i;
        int el;
        for (i = 0; i < n; i++) {
            System.out.println("enter " + (i + 1) + " element: ");
            el = in.nextInt();
            massInt[i] = el;
        }
        // Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        for (i = 0; i < n; i++) {
            System.out.print(massInt[i] + " ");
        }
        System.out.println();
        for (i = n; i > 0; i--) {
            System.out.print(massInt[i - 1] + " ");
        }
        System.out.println();
        // Найти минимальный-максимальный элементы и вывести в консоль.
        // Найти индексы минимального и максимального элементов и вывести в консоль.
        int max = massInt[0];
        int min = massInt[0];
        int iMax = 0;
        int iMin = 0;
        for (i = 0; i < n; i++) {
            if (massInt[i] > max) {
                max = massInt[i];
                iMax = i;
            }
            if (massInt[i] < min) {
                min = massInt[i];
                iMin = i;
            }

        }
        System.out.println("max element is " + max + ", its index is " + iMax);
        System.out.println("min element is " + min + ", its index is " + iMin);
        // Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
        // вывести сообщение, что их нет.
        int count = 0;
        for (i = 0; i < n; i++) {
            if (massInt[i] == 0) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("no elements equal 0");
        } else System.out.println(count + " elements equal 0");

    //Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    //содержит нуля в начале, кроме самого числа 0.
        if (massInt[0]==0 && n>1) {
            System.out.println("incorrect input");
            return;
        } else {

        massInt[n-1]+=1;
        for (i=n-1; i>0; i--) {
            if (massInt[i]==10) {
                massInt[i-1]+=1;
                massInt[i]=0;
            }
        }

        if (massInt[0] == 10) {
            int[] massInt2 = new int[n+1];
            massInt2[0]=1;
            massInt2[1]=0;
            System.arraycopy(massInt, 1, massInt2, 2, n-1);
            System.out.println("result is :");
            for (i = 0; i < n+1; i++) {
                System.out.print(massInt2[i] + " ");
            }

        } else {
            System.out.println("result is :");
            for (i = 0; i < n; i++) {
                System.out.print(massInt[i] + " ");
            }
        }

        }
        // Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.
        int temp;
        for (i = 0; i < n / 2; i++) {
            temp = massInt[n - i - 1];
            massInt[n - i - 1] = massInt[i];
            massInt[i] = temp;
        }
        // Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего)
        boolean increase;
        increase = true;
        for (i = 0; i < n-1; i++) {
            if (!(massInt[i]<massInt[i+1] && increase))
                increase = false;
        }
        if (increase) {
            System.out.println("increasing sequence");
        } else {
            System.out.println("not increasing sequence");
        }
    }
}
