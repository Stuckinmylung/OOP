package BTVN_T3;

import java.util.Scanner;

public class NumberGuess {
    final int SECRET_NUMBER = (int) (Math.random() * 100);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess_time = 0;
        System.out.println("Key in your guess : ");
        int ans = in.nextInt();
        NumberGuess nb = new NumberGuess();
        while (ans >= 0 && ans <= 99) {
            if (ans == nb.SECRET_NUMBER) {
                guess_time++;
                break;
            } else if (ans < nb.SECRET_NUMBER) {
                guess_time++;
                System.out.println("Try higher");
            } else {
                guess_time++;
                System.out.println("Try lower");

            }
            ans = in.nextInt();
        }
        System.out.println("You got it in " + guess_time + " trials");
    }
}
