package dmdev.java2.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "deded +375 (33) 898-12-13 gtrvrt rtgrtgrtg +375 (29) 898-14-13 brgbrtbrtb +375 (44) 777-12-13 ee +375 (25) " +
                "111-11-25 dferergverv dfer";

//        String regex = "(\\+375)? ?(\\(\\d{2}\\)) ?\\d{3}-\\d{2}-\\d{2}";

//        String regex = "(\\+375)? ?\\((\\d{2})\\) ?\\d{3}-\\d{2}-\\2"; // последние цифры должны быть равны второй группе
//        String regex = "(\\+375)? ?\\((?<code>\\d{2})\\) ?\\d{3}-\\d{2}-\\2"; // группе присвоили имя
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?\\d{3}-\\d{2}-\\1"; // исключили группу из списка

        Pattern pattern = Pattern.compile(regex); Matcher matcher = pattern.matcher(phoneNumber);

        while (matcher.find()) {
//            System.out.println(matcher.group());
//            System.out.println(matcher.group(1)); // получаем ПЕРВУЮ группу символов взятую нами в скобки (\\+375)
//            System.out.println(matcher.group(2)); // получаем ВТОРУЮ группу символов взятую нами в скобки (\(\d{2}\))

            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group("code"));
        }
    }
}
