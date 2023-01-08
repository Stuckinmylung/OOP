package BaiTap_Buoi1;

public class ReverseInt {
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;
        int surplus = 0;
        while (n > 0){
            surplus = n % 10;
            rev = rev * 10 + surplus;
            n=n/10;
        }
        System.out.println("The rev number is " + rev);
    }
}
