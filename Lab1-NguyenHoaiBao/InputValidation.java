package BaiTap_Buoi1;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberIn;
        boolean isValid;
        isValid = false;
        do {
            System.out.print("Enter a number between 0-10 or 90-100: " );
            numberIn = in.nextInt();
            if ((numberIn > 0 && numberIn < 10) || (numberIn > 90 && numberIn < 100)) {
                System.out.println("You have entered : " + numberIn);
                isValid = true;
            }
            else {
                System.out.println("Invalid input, try again...");
            }

        }while (!isValid);
    }
}
