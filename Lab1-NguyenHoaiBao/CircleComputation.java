package BaiTap_Buoi1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius, diameter, circumference,area;
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %2f%n",diameter);
        System.out.printf("circumference is: %2f%n",circumference);
        System.out.printf("Diameter is: %2f%n",diameter);

    }
}