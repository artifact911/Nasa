package staticMethods.searchArray;

public abstract class BinarySearch {

    //int index = Arrays.binarySearch(sortedArray, key);
    //int index = Collections.binarySearch(sortedList, key);

    static public int runBinarySearchIteratively(int[] sortedArray, int key) {
        int index = -1;
        int low = sortedArray[0];
        int high = sortedArray[sortedArray.length - 1];

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }
}

