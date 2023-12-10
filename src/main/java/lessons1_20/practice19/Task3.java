package lessons1_20.practice19;

// Задача 3:
//Переписать предыдущий код используя интерфейс Runnable.
public class Task3 {
    public static void main(String[] args) {
        System.out.println("main thread starts working");
        MyRunnable myRunnable =new MyRunnable();
        Thread thread1=new Thread(myRunnable);
        thread1.start();
        try {
            thread1.join();
        }
        catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread ends working");

    }
}
