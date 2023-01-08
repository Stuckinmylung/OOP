package BTVN_T2;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_ITEMS;
        int [] items;
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0) {
            for (int i = 0; i < items.length ; i++) {
                items[i] = in.nextInt();
            }
        }
        in.close();
        System.out.print("The value are: [");
        for (int i = 0; i < items.length; i++) {
            if(i == 0){
                System.out.print(items[i]);
            }
            else {
                System.out.print(", " + items[i]);
            }
        }
        System.out.println("]");
    }
}
