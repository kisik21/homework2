package lesson31.Decorator;

class ColoredShape implements Shape {
    private Shape shape;
    private String color;
    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }
    @Override
    public void draw() {
        shape.draw();
        System.out.println("Coloring the shape " + color);
    }
}