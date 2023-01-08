package lab10.ex5;

public interface Poly {
    int degree();
    Poly derivative();
    double coefficient(int degree);
    double[] coefficient();
}
