package BaiTap_Buoi1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += number;
        }
        average = (double)sum/UPPERBOUND;
        System.out.println("SUM is " + sum);
        System.out.println("AVERAGE is " + average);
    }
}
