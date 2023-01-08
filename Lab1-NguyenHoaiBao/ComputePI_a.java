package BaiTap_Buoi1;

public class ComputePI_a {
    public static void main(String[] args) {
        int MAX_TERM = 1000;
        int sum = 0;
        for (int term = 1; term <= MAX_TERM ; term++) {
            if(term % 2 == 1){
                sum += (double)1.0/(term*2 -1);
            }
            else {
                sum -= (double)1/(term*2 -1);
            }
        }
        double pi =4 * sum;
        System.out.println(pi);

    }
}
