package lessons1_20.practice16;

public sealed class Fruit permits Apple, Kiwi, Mango {

    String color;
    int weight;
}
