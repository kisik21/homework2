package lessons1_20.practice14;


// Задача 4:
//При помощи лямбда выражения реализовать логику, при которой, если а < b, то вернуть
//а. Если a > b, то вернуть b. Иначе вернуть 0.
public class Task4 {
    public static void main(String[] args) {
        Compare compare;
        compare = (x, y) -> {
            if(x>y) {
                return y;
            } else if(x<y) {
                return x;
            } else return 0;
        };
        double result=compare.getSmaller(5, 3);
        System.out.println(result);

    }

}
