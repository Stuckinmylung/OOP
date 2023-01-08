package BaiTap_Buoi1;

public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator < MAX_DENOMINATOR; denominator+=2) {
            if(denominator%4==1){
                sum+=(double)1/denominator;
            } else if (denominator%4==3) {
                sum-=(double)1/denominator;
            }
            else {
                System.out.println("Impossible!!!");
            }
        }
        double pi =4 * sum;
        System.out.println(pi);
    }
}
