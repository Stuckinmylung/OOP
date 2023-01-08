package BTVN_T2;

import java.util.Scanner;

public class GradesStatistics_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ò students: ");
        int number = in.nextInt();
        int [] numbers = new int [number];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
            sum += numbers[i];
            min = Math.min(min,numbers[i]);
            max = Math.max(max,numbers[i]);
        }
        System.out.printf("The average is : %.2f \n", (double)sum/number);
        System.out.println("The minimum is : " + min );
        System.out.println("The maximim is : " + max );

    }
}
