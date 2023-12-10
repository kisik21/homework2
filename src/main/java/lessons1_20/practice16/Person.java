package lessons1_20.practice16;



public record Person(String name, int age) {

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }
//    public void setName (String newName) {
//        name=newName;   // Cannot assign a value to final variable 'name'
//    }

}

