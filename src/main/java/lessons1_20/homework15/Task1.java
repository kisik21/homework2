package lessons1_20.homework15;

import java.util.ArrayList;
import java.util.Scanner;

// Задача 1:
//Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//Stream'ов:
//- Удалить дубликаты
//- Оставить только четные элементы
//- Вывести сумму оставшихся элементов в стриме
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("enter list size (>0):");
        int n;
        do {
            n=in.nextInt();
        } while (n<0);
        for (int i=0; i<n; i++) {
            System.out.println("enter element " + i);
            list.add(in.nextInt());
        }
        System.out.println(list);
        int sumR=list.stream().distinct().filter(x->x%2==0).reduce(Integer::sum).orElse(0);


        System.out.println("sum of remaining elements is : " + sumR);
    }
}
