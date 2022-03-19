package step.cw.Interfaces.minMaxAscDescArray;

public class IShowWork {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        Array arrayObj = new Array(array);

        arrayObj.print();
        arrayObj.print("Array is: ");
        System.out.println(arrayObj.max());
        System.out.println(arrayObj.min());
        System.out.println(arrayObj.avg());
        arrayObj.sortAsc();
        arrayObj.sortDesc();
    }
}
