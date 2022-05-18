package enumEx.kiril;

public class EnumEx {
    public static void main(String[] args) {
        EnumKiril start = EnumKiril.START;
        start.tetName1();
        System.out.println(start.getName() + start.getSurname());
        start.tetName2();
        System.out.println(start.getName() + start.getSurname());
    }
}
