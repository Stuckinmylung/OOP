package BTVN_T4;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 25, 30, 45, 100};
        System.out.println(binarySearch(arr,6,0,6));
        System.out.println(binarySearch(arr,1));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (array == null) return false;
        if (toIdx >= fromIdx && fromIdx <= array.length - 1) {
            int midIdx = fromIdx + (toIdx - fromIdx) / 2;
            if (array[midIdx] == key)
                return true;
            if (array[midIdx] > key)
                return binarySearch(array, key, fromIdx, midIdx - 1);
            return binarySearch(array, key, midIdx + 1, toIdx);
        }
        return false;
    }

    public static boolean binarySearch(int [] arr, int x) {
        int fromIdx = 0, toIdx = arr.length - 1;
        while (fromIdx <= toIdx) {
            int midIdx = fromIdx + (toIdx - fromIdx) / 2;

            if (arr[midIdx] == x)
                return true;

            if (arr[midIdx] < x)
                fromIdx = midIdx + 1;

            else
                toIdx = midIdx - 1;
        }

        return false;
    }

}
