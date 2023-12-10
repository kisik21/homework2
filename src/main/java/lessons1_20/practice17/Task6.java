package lessons1_20.practice17;

// 6. В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!”
//найти имя и фамилию человека и вывести на экран!
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String text = "Hello everybody!! My name is Bill Gates and i dream about studying in TeachMeSkills!";
        Pattern pattern = Pattern.compile("[A-Z]\\w+ [A-Z]\\w+ ");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
