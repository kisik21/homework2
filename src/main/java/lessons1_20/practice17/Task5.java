package lessons1_20.practice17;
// 5. В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String str1 = "Hello \n world \n !!!";
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(str1);
        String str2 = matcher.replaceAll("");
        System.out.println(str2);
    }
}
