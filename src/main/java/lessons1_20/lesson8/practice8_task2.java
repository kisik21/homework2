package lessons1_20.lesson8;
// Задача 2: Создать класс Person с полями name, age, gender. Поле name сделать
// public, age оставить по дефолту, gender – private. В классе Main создать
// объект Person. Предположить какие поля мы увидим. Продемонстрировать значения
// полей объекта используя геттеры и поля если это возможно.
public class practice8_task2 {
    public static void main(String[] args) {

        Person stas = new Person("Stas", 30, 'M');

        System.out.println("name is: " + stas.getName() );
        System.out.println("age is: " + stas.getAge() );
        System.out.println("gender is: " + stas.getGender() );

        System.out.println("name is: " + stas.name );
        System.out.println("age is: " + stas.age );
        //System.out.println("gender is: " + stas.gender );
        //not possible (gender has private access)
    }
}
