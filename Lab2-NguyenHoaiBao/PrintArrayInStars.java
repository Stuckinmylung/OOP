package BTVN_T2;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int [] items;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (seperated by space): ");
        for (int i = 0; i < items.length; i++) {
            items[i] = in.nextInt();
        }
        in.close();
        for (int i = 0; i < items.length; ++i) {
            System.out.print(i + ": ");
            for (int j = 1; j <= items[i] ; ++j) {
                System.out.print("*");
            }
            System.out.print(" ("+i+")");
            System.out.println();
        }
    }
}
