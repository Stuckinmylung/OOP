package BTVN_T3;

public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {
        double sum = 0;
        for (int i = 1; i <= numTerms; i++) {
            if (i % 2 == 1) {
                sum += Math.pow(x, i) / i;
            } else {
                double odd_series = 1;
                double even_series = 1;
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 1) {
                        odd_series *= j;
                    } else {
                        even_series *= j;
                    }
                }
                double fac = odd_series / even_series;
                sum += fac;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(specialSeries(2, 1));
    }
}
