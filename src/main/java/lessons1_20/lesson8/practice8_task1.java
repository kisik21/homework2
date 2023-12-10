package lessons1_20.lesson8;
// Создать класс Build с одним полем type. Создать 2-х наследников этого класса – House и
//Garage, в которых при создании в конструкторе будет присваиваться в поле type значения
//“House” и “Garage” соответственно. В методе main другого класса создать объекты House
//и Garage классов. Продемонстрировать значения полей этих классов используя геттеры.
public class practice8_task1 {
    public static void main(String[] args) {
        Build house1 = new House();
        Build garage1 = new Garage();

        System.out.println(house1.getType());
        System.out.println(garage1.getType());


    }
}
