package lessons1_20.practice10;

public class task2 {
    public static void main(String[] args) {
        // 2.1 Создать объект StringBuilder c любой строкой.
        StringBuilder sb = new StringBuilder("01234567899");
        // 2.2 Добавить к строке “xxxx”
        String s = sb.append("xxxx").toString();
        System.out.println(s);
        // 2.3 В 5-ю позицию вставить “y”
        String s2=sb.insert(5, "y").toString();
        System.out.println(s2);
        // 2.4 Удалить символы с 3 по 6
        String st3=sb.delete(2, 6).toString();
        System.out.println(st3);
        // 2.5 Перевернуть строку.
        String st4=sb.reverse().toString();
        System.out.println(st4);
        // 2.6 Преобразовать в String и вывести в консоль.
        String st5=sb.toString();
        System.out.println(st5);


    }
}
