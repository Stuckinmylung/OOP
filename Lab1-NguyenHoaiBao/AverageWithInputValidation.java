package BaiTap_Buoi1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_STUDENT = 3;
        int numberIn;
        int sum = 0;
        boolean isValid;
        double average;

        for (int studentNo = 1; studentNo <= NUM_STUDENT; ++studentNo) {
            isValid = false;
            do {
                System.out.print("Enter the mark (0 - 100) for student" + studentNo + ": ");
                numberIn = in.nextInt();
                if (numberIn >=0 && numberIn <= 100){
                    isValid = true;
                }
                else {
                    System.out.println("Invalid input, try again...");
                }
            }while (!isValid);
            sum += numberIn;
        }
        average = (double)sum/NUM_STUDENT;
        System.out.println("The average is : "  + average );
    }
}
