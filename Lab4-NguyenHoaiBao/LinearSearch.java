package BTVN_T4;

public class LinearSearch {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        System.out.println(linearSearch(Array, 5));
        System.out.println(linearSearchIndex(Array,5));
    }

    public static boolean linearSearch(int[] Array, int key) {
        for (int num : Array) {
            if (num == key)
                return true;
        }
        return false;
    }
    public static int linearSearchIndex(int[] Array, int key) {
        for (int i = 0; i < Array.length; i++) {
            if(Array[i]==key)
                return i;
        }
        return 0;
    }
}
