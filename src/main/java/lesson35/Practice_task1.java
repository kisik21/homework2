package lesson35;
// Задача 1:
//1.1 Создать список: номер карты и количество денег на карте, используя HashMap.
//1.2 Добавить к этому списку 3 записи.
//1.3 Удалить 2 записи.
//1.4 Вывести запись по ключу.
//1.5 Вывести список всех ключей.
//1.6 Вывести список всех сумм на картах.
//1.7 Проверить, содержится ли любой элемент в коллекции.
import java.util.HashMap;

public class Practice_task1 {

    public static void main(String[] args) {
        HashMap<String, Integer> cards = new HashMap<>();
        cards.put("1234543287650000", 122);
        cards.put("2222443300007777", 800);
        cards.put("3456987600001234", 1403);
        cards.put("900909", -100);
        cards.remove("900909");
        System.out.println(cards.get("2222443300007777")); //800
        System.out.println(cards.get("22243300007777")); // null
        System.out.println(cards.keySet());
        System.out.println(cards.values());
        System.out.println(cards.containsValue(400));
        System.out.println(cards.containsValue(122));

    }


}

