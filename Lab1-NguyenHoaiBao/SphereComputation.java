package BaiTap_Buoi1;

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius, surfaceArea, volume;
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 /3 * Math.PI * radius * radius * radius;
        System.out.printf("Diameter is: %.2f",surfaceArea);
        System.out.println();
        System.out.printf("volume is: %.2f",volume);
    }
}
