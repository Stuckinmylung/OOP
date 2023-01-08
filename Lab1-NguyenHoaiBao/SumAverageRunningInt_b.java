package BaiTap_Buoi1;

public class SumAverageRunningInt_b {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = LOWERBOUND;
        while(number <= UPPERBOUND) {
            sum += number;
        }
        average = (double)sum/(UPPERBOUND-LOWERBOUND+1);
        System.out.println("SUM is " + sum);
        System.out.println("AVERAGE is " + average);
    }
}
