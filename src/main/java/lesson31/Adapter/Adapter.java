package lesson31.Adapter;

class Adapter implements Target {
    private Adaptee adaptee;
    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void doSomething() {
        adaptee.doSomethingElse();
    }
}