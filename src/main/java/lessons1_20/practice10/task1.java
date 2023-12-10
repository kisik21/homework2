package lessons1_20.practice10;

public class task1 {
    public static void main(String[] args) {
        String st1="abc";
        String st2="123";
        // 1.1 Объединить 2 строки в одну 2-мя способами.
        String st3=st1 + st2;
        String st4=st1.concat(st2);
        System.out.println(st3 + " " + st4);
        // 1.2 Проверить 2 строки на равенство с и без учета регистра.
        String st5="AbC";
        boolean t=st1.equals(st5);
        boolean r=st1.equalsIgnoreCase(st5);
        System.out.println("st1=st5: " + t + ", st1=st5 ignore case: " + r);
        // 1.3 Вернуть подстроку с 3-го символа до конца
        String st6="1etrgJrec1";
        System.out.println("st6 from 3rd symbol: " + st6.substring(2));
        // 1.4 Вывести длину строки
        System.out.println("st6 length: " + st6.length());
        // 1.5 Вывести порядковый номер любого символа в строке.
        System.out.println("index of 'g' is: " + st6.indexOf('g'));
        // 1.6 Преобразовать логический тип true к строке.
        boolean a=true;
        String st7= String.valueOf(a);
        System.out.println("bollean to string: " + st7);
        // 1.7 Перевести строку в верхний регистр.
        System.out.println("st6 to upper case: " + st6.toUpperCase());
        // 1.8 Заменить ‘1’ в строке на ‘%’.
        System.out.println("1 replaced with %: " + st6.replace('1', '%'));
        // 1.9 Убрать все пробелы в строке с двух сторон.
        String st8="    e3rrjy   ";
        System.out.println("delete space in begining and end:" + st8.trim());
        // 1.10 Проверить, пустая ли строка.
        String st9="";
        System.out.println("st9 is empty: " + st9.isEmpty());
        // 1.11 Разбить строку на несколько по делителю.
        String st10="rokrabrkgrfabrlrlab45rt";
        String[] substr = st10.split("ab");
        System.out.println("split st10:");
        for (String s : substr) {
            System.out.println(s);
        }

    }
}
