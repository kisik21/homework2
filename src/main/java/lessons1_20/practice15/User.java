package lessons1_20.practice15;


class User {
    private static String name;
    public User(String name) {
        User.name = name;
    }
    public User () {

    }
    public Object getName() {
        return name;
    }
}