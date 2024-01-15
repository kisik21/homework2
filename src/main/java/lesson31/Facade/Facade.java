package lesson31.Facade;

class Facade {
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    public Facade() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
    }
    public void operation() {
        subSystem1.operation1();
        subSystem2.operation2();
    }
}