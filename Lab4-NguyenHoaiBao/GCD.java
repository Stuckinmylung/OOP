package BTVN_T4;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(30,10));
    }
    public static int gcd(int a,int b){
        if (b != 0){
            return gcd(b, a % b);
        } else{
            return a;
        }
    }
}
