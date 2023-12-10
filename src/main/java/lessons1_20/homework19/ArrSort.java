package lessons1_20.homework19;


public class ArrSort extends Thread{


    int [] arr;
    String t;

    ArrSort (int[] arr, String t) {
        this.arr=arr;
        this.t=t;
    }
    public void run() {
        synchronized (arr) {
            switch (t) {
                case ("insertion") -> {
                    for (int i = 1; i < arr.length; i++) {
                        //сохраняем ссылку на индекс предыдущего элемента
                        int swap = arr[i];
                        int j;
                        for (j = i; j > 0 && swap < arr[j - 1]; j--) {
                            //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                            arr[j] = arr[j - 1];
                        }
                        arr[j] = swap;
                    }
                    System.out.println("insertion sorted array: ");
                }
                case ("selection") -> {
                    for (int i = 0; i < arr.length; i++) {
                        int pos = i;
                        int min = arr[i];
                        // цикл выбора наименьшего элемента
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[j] < min) {
                                pos = j;
                                min = arr[j];
                            }
                        }
                        arr[pos] = arr[i];
                        arr[i] = min;
                    }
                    System.out.println("selection sorted array: ");
                }
                case ("bubble") -> {
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = arr.length - 1; j > i; j--) {
                            if (arr[j - 1] > arr[j]) {
                                int tmp = arr[j - 1];
                                arr[j - 1] = arr[j];
                                arr[j] = tmp;
                            }
                        }
                    }
                    System.out.println("bubble sorted array: ");
                }
                default -> System.out.println("Wrong input");
            }
            for (int el : arr) {
                System.out.print(el + " ");

            }
            System.out.println();
        }
    }
}
