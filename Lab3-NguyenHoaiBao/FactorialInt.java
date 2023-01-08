package BTVN_T3;

public class FactorialInt {
    public static void main(String[] args) {
        int idx = 1;
        int fac = 1;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            System.out.println("The factorial of " + idx + " is " + fac);
            idx++;
            if((Integer.MAX_VALUE/fac) < i+1){
                break;
            }
            fac *= i;
        }
        System.out.println("The factorial of " + idx + " is out of range");
    }
}


