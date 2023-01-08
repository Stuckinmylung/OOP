package lab_5.ex_17;

public class TestMain {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(1, 2);
        MyPoint v2 = new MyPoint(2, 3);
        MyPoint v3 = new MyPoint(4, 3);
        MyTriangle triangle = new MyTriangle(v1, v2, v3);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
    }
}
