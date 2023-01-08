package BTVN_T4;

public class InsertionSort {
    public static void main(String[] args) {
        SelectionSort sls = new SelectionSort();
        InsertionSort iss = new InsertionSort();
        int[] Array = {1, 7, 3, 9, 2, 4};
        iss.insertionSort(Array);
        sls.print(Array);

    }

    public void insertionSort(int[] Array) {
        for (int i = 1; i < Array.length; ++i) {
            int temp = Array[i];
            int j = i - 1;

            while (j >= 0 && Array[j] > temp) {
                Array[j + 1] = Array[j];
                j = j - 1;
            }
            Array[j + 1] = temp;
        }
    }
}
