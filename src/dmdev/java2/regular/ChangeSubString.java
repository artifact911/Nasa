package dmdev.java2.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeSubString {

    public static void main(String[] args) {
        String phoneNumber = "deded +375 (33) 898-12-13 gtrvrt rtgrtgrtg +375 (29) 898-14-13 brgbrtbrtb +375 (44) 777-12-13 ee +375 (25) " +
                "111-11-25 dfer";

        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?(\\d{3})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
//            matcher.appendReplacement(stringBuilder, "XXX");

            String gr1 = matcher.group(2);
            String gr2 = matcher.group(3);
            String gr3 = matcher.group(4);
//            matcher.appendReplacement(stringBuilder, gr1 + " " + gr2 + " " + gr3);
            // перепишем
            matcher.appendReplacement(stringBuilder, "$2 - $3 - $4");
        }
        matcher.appendTail(stringBuilder); // что бы не потерять хвост строки, который не подходит под регулярку
        System.out.println(stringBuilder);

        System.out.println(phoneNumber.replaceAll(regex, "$2 - $3 - $4 | "));
    }
}
