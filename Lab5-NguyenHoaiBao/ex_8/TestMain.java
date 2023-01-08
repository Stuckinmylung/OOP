package lab_5.ex_8;

public class TestMain {
    public static void main(String[] args) {
        // Can invoke with a variable number of arguments
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        // Can also invoke with an array
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial p2 = new MyPolynomial(coeffs);
        System.out.println(polynomial1.multiply(polynomial2));
        System.out.println(polynomial1.add(polynomial2));
    }
}
