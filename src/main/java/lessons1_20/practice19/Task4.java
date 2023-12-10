package lessons1_20.practice19;


// Создать класс Counter с полем count и методом increase() который увеличивает count на
//1. Создать второй класс CounterThread с интерфейсом Runnable, полем Counter и
//конструктором, который инициализирует поле Counter.
// В main методе создать объект Counter. Создать 5 потоков которые будут использовать в
//конструкторе объект Counter. Запустить все 5 потоков и посмотреть результат. Исправить
//код чтобы он выводил ожидаемый результат(1,2,3,4,1,2,3,4,1 и тд).
public class Task4 {
    public static void main(String[] args) {
        Counter counter=new Counter();
        CounterThread counterThread1=new CounterThread(counter);
        Thread thread1=new Thread(counterThread1);
        CounterThread counterThread2=new CounterThread(counter);
        Thread thread2=new Thread(counterThread2);
        CounterThread counterThread3=new CounterThread(counter);
        Thread thread3=new Thread(counterThread3);
        CounterThread counterThread4=new CounterThread(counter);
        Thread thread4=new Thread(counterThread4);
        CounterThread counterThread5=new CounterThread(counter);
        Thread thread5=new Thread(counterThread5);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
