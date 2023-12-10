package lessons1_20.practice19;
// Задача 2:
//С помощью метода join() изменить предыдущий код таким образом, чтобы надпись “Поток
//main завершает свою работу” всегда была последней.
public class Task2 {
    public static void main(String[] args) {
        System.out.println("main thread starts working");
        Child child=new Child();
        child.start();
        try {
            child.join();
        }
        catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread ends working"); // now main ends working after child
    }
}
