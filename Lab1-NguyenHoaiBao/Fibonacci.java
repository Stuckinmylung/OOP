package BaiTap_Buoi1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Finbonacci number are ");
        System.out.print(fnMinus1 + " " + fnMinus2 +" ");

        while (n <= nMax){
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn+" ");
            sum+=fn;
            n++;
            fnMinus1=fnMinus2;
            fnMinus2=fn;
            sum+=fn;
        }
        System.out.println();
        System.out.println("The average is " + (double)sum/n);
    }
}
