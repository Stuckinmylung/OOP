package BTVN_T3;

public class TrigonometricSeries {
    public static double sin(double x){
        double sin = 0;
        double fact;
        for(int i=1; i<=500; i++){
            fact=1;
            for(int j=1; j<=2*i-1; j++){
                fact=fact*j;
            }
            if(i%2==1){
                sin=sin+ (Math.pow(x,2*i-1)/fact);
            }else{
                sin=sin- (Math.pow(x,2*i-1)/fact);
            }
        }
        return sin;
    }
    public static double cos(double x, int numTerms){
        double cos = 1;
        double fact;
        for(int i=1; i<=numTerms; i++){
            fact=1;
            for(int j=1; j<=2*i; j++){
                fact=fact*j;
            }
            if(i%2==1){
                cos=cos- (Math.pow(x,2*i)/fact);
            }else{
                cos=cos+ (Math.pow(x,2*i)/fact);
            }
        }
        return cos;
    }

    public static void main(String[] args) {
//        System.out.println(cos(2,100));
//        System.out.println(Math.cos(2));
//        System.out.println(sin(2));
//        System.out.println(Math.sin(2));
        System.out.println(sin(2));
        System.out.println(Math.sin(2));
        System.out.println(Math.log(3.5));

    }


}
