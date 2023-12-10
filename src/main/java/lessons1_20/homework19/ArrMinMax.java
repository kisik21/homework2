package lessons1_20.homework19;

public class ArrMinMax extends Thread{
    int [] arr;
    String t;
    int result;
    ArrMinMax (int[] arr, String t) {
        this.arr=arr;
        this.t=t;
    }

    public void run() {
        switch (t) {
            case ("min") -> {
                int min = arr[0];
                for (int el : arr) {
                    if (el < min) {
                        min = el;
                    }
                }
                result=min;
            }
            case ("max") -> {
                int max = arr[0];
                for (int el : arr) {
                    if (el > max) {
                        max = el;
                    }
                }
                result=max;
            }
            default -> System.out.println("Wrong input");
        }

    }
    int getResult () {
        return result;
    }
}
