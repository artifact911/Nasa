package practice.step.examples.part1;

/**
 * Объявление переменны[ целочисленных типов
 * Инициализация и присваивание новых значений.
 */
public class Task02 {
    public static void main(String[] args) {
        int x; // это переменная с именем x
        int y; // это тоже переменная, но с именем y
        int z; // и это тоже переменная, но с именем z

        // множественное присваивание значений, лучше так не  делать
        x = y = z = 3;

        // вывод в консоль суммы значений переменных
        System.out.println(x + y + z);
        x = 0; // одиночное присваивание в переменную x будет помещено значение
        // 0
        x = 1; // в переменную x будет помещено значение 1, а предыдущее
        // значение затрется (будет потерено)
        y = 2;
        z = 3;
        System.out.println(x + y + z);
    }
}