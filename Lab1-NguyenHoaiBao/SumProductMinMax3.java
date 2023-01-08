package BaiTap_Buoi1;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1, number2, number3, sum, product, min, max;
        Scanner in = new Scanner(System.in);
        number2 = in.nextInt();
        number1 = in.nextInt();
        number3 = in.nextInt();
        in.close();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        System.out.println("Enter 1st integer : " + number1);
        System.out.println("Enter 2nd integer : " + number2);
        System.out.println("Enter 3rd integer : " + number3);
        System.out.println("The sum is : " + sum);
        System.out.println("The product is : " + product);
        System.out.println("The min is : " + Math.min(Math.min(number1,number2),number3));
        System.out.println("The min is : " + Math.max(Math.max(number1,number2),number3));
    }
}
