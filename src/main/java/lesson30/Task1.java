package lesson30;

public class Task1 {
    public static void main(String[] args) {
        //Sun sun=new Sun("S-1"); // 'Sun(java.lang.String)' has private access in 'lesson30.Sun'

        System.out.println(Sun.getInstance("S-1"));
    }
}
