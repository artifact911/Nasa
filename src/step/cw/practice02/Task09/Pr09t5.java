package step.cw.practice02.Task09;

import java.util.Arrays;

public class Pr09t5 {
    public static void main(String[] args) {
        String text = "снесла курочка яичко. да не простое, а золотое. потом снесла еще 1 и еще 3. потом надоело.";
        int count = 0;
        int flag = 0;

        String[] arrText = text.split("\\. ");
        System.out.println(Arrays.toString(arrText));

        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < arrText.length; i++) {
            Character l = arrText[i].charAt(0); // Объявили Чар L являющиеся первой буквой первого элемента массива
            String a1 = String.valueOf(l); // Перевели чар в стринг
            Character upperCh = Character.toUpperCase(l); // Объявили чар и сделали чар l с большой буквы
            String a2 = String.valueOf(upperCh); // Объявили новый стринг и положили в него новый чар с большой буквы

            //System.out.println(l);
            newText.append(arrText[i].replaceFirst(a1, a2));
            newText.append(". ");

        }
        System.out.println(newText);

        char[] arrChar = text.toCharArray();
        //System.out.println(Arrays.toString(arrChar));

        for (int i = 0; i < arrChar.length; i++) {
            if (Character.isDigit(arrChar[i])) {
                count++;

            }
        }
        System.out.println("Есть Числа: " + count + " раз");
        count = 0;

        char[] arrCharTest = new char[]{'.', ',', '!', '?', ':', ';'};

        for (int i = 0; i < arrChar.length; i++) {
            for (int j = 0; j < arrCharTest.length; j++) {
                if (arrChar[i] == arrCharTest[j]) {
                    count++;
                }
            }
        }
        System.out.println("Знаки препинания встречаются: " + count + " раз");
        System.out.println("Количество предложений равно: " + arrText.length);


    }
}
