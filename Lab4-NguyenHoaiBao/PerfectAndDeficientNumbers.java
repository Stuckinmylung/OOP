package BTVN_T4;

import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static boolean isPerfect(int aPosInt){
        int sum = 0;
        for (int i = 1; i <= aPosInt/2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum == aPosInt;
    }
    public static boolean isDeficient(int aPosInt){
        int sum = 0;
        for (int i = 2; i <= aPosInt/2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum < aPosInt;
    }

}
