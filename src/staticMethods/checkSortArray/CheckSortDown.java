package staticMethods.checkSortArray;

public abstract class CheckSortDown {

    public static boolean isArraySortedDown(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
