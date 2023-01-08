package BTVN_T4;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort n = new SelectionSort();
        int[] arr = {3, 5, 1, 4, 8, 10, 12};
        n.selectionSort(arr);
        System.out.print("\tAfter sort\n");
        n.print(arr);
    }

    public void selectionSort(int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            int min_index;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < Array[i]) {
                    min_index = j;
                    int tmp = Array[min_index];
                    Array[min_index] = Array[i];
                    Array[i] = tmp;
                }
            }
        }
    }

    void print(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            if (i == 0) {
                System.out.print("[" + Array[i]);
            } else {
                System.out.print(", " + Array[i]);
            }
        }
        System.out.print(']');
    }
}
