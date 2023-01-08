package BTVN_T4;

import java.util.Scanner;

import static BTVN_T4.PerfectAndDeficientNumbers.isDeficient;
import static BTVN_T4.PerfectAndDeficientNumbers.isPerfect;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        System.out.println("These numbers are perfect:");
        int count = 0;
        for (int i = 6; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n%c%d perfect numbers found (%.2f%c)%c\n\n",'[', count, (double) count / n * 100, '%',']');
        System.out.println("These numbers are neither deficient nor perfect :");
        int count_ = 0;
        for (int i = 0; i <= n; i++) {

            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i+" ");
                count_++;
            }

        }
        System.out.printf("\n%c%d numbers found (%.2f%c)%c",'[',count_, (double) count_ / n * 100, '%',']');
    }
}
