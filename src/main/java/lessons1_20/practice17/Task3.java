package lessons1_20.practice17;

// 3. Написать метод который сможет вернуть инсту в строке из 1 задания.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task3 {
    public static void main(String[] args) {
        String str="Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        Pattern pattern1= Pattern.compile("@(.*)");
        Matcher matcher=pattern1.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
