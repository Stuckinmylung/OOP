package BTVN_T3;

public class FibonacciInt {

    public static void main(String[] args) {
        int firstTerm = 1, secondTerm = 2, idx = 1;
        while (!(Integer.MAX_VALUE - secondTerm < firstTerm)) {
            System.out.println("F(" + idx + ") = " + firstTerm);
            idx++;
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println("F("+idx+") is out of range of int");
    }
}
