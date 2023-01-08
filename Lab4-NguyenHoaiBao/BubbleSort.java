package BTVN_T4;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bbs = new BubbleSort();
        int[] Array = {1, 7, 5, 2, 9, 3};
        bbs.bubbleSort(Array);
        SelectionSort sls = new SelectionSort();
        sls.print(Array);

    }

    public void bubbleSort(int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = i + 1; j < Array.length - i - 1; j++) {
                if (Array[j] > Array[j+1]) {
                    int temp = Array[i];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
    }
}
