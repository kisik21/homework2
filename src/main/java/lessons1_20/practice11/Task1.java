package lessons1_20.practice11;
// 1.1 Написать код, который выбросит ArrayIndexOutOfBoundException. Обработать
//используя try-catch конструкцию.
//1.2 Добавить обработку арифметического исключения к предыдущему блоку try-catch
//используя множественные операторы.
//1.3 Преобразовать множественные try-catch в мульти обработчик.
public class Task1 {

    public static void main(String[] args) {
        int k=5;
        int t;
        int[] arrayInt=new int[] {4, 3, 2, 1, 0};
        try {
            for (int i=0; i<10; i++) {
                System.out.println(arrayInt[i]);
                t=k/arrayInt[i];
            }
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Max index is 4!");
            System.out.println(e);
        }
    }
}
