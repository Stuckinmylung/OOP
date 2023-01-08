package lab_5.ex_7;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary) : ");
        double real = Double.parseDouble(in.next());
        double imag = Double.parseDouble(in.next());
        MyComplex m1 = new MyComplex(real, imag);
        System.out.print("Enter complex number 2 (real and imaginary) : ");
        double real_ = Double.parseDouble(in.next());
        double imag_ = Double.parseDouble(in.next());
        MyComplex m2 = new MyComplex(real_, imag_);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println("Number 1 is : " + m1.toString());
        System.out.println(m1.toString() + (m1.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(m1.toString() + (m1.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));
        System.out.println("Number 2 is : " + m2.toString());
        System.out.println(m2.toString() + (m2.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(m2.toString() + (m2.isReal() ? " is a pure imaginary number" : " is NOT a imaginary real number"));

        System.out.println(m1.toString() + (m1.equals(m2) ? " is equal to " : " is NOT equal to" + m2.toString()));
        System.out.println(m1.toString() + " + " + m2.toString() + " = " + m1.addNew(m2).toString());
    }
}
