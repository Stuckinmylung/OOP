package BTVN_T3;

import java.util.Scanner;

public class NumberConversion {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a your number and radix: ");
        String numberStr = in.next();
        System.out.print("Enter your input radix: ");
        int inRadix = in.nextInt();
        System.out.print("Enter your output radix: ");
        int outRadix = in.nextInt();
        System.out.print("\"" + numberStr + "\" in radix " + inRadix + " is \"" + toRadix(numberStr, inRadix, outRadix) + "\" in radix " + outRadix + ".");
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        if (outRadix == 10) {
            return toDec(in, inRadix);
        }
        if (inRadix == 10) {
            return decToN(in, outRadix);
        }
        String dec = toDec(in, inRadix);
        return decToN(dec, outRadix);
    }

    public static String decToN(String in, int outRadix) {
        int dec = Integer.parseInt(in);
        String res = "";
        while (dec > 0) {
            int tmp = dec % outRadix;
            if (tmp < 10) {
                res = tmp + res;
            } else {
                res = (char) (tmp + 55) + res;
            }
            dec /= outRadix;
        }
        return res;
    }

    public static String toDec(String in, int inRadix) {
        in = in.toUpperCase();
        int res = 0;
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                res = res * inRadix + d;
            } else if (c >= 'A' && c <= 'F') {
                int d = c - 'A' + 10;
                res = res * inRadix + d;
            }
        }
        return res + "";
    }

}