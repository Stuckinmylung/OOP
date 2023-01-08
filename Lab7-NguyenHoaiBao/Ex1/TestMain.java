package lab_7.Ex1;

public class TestMain {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5,"red",false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getClass());
        System.out.println(((Circle)s1).getRadius());
    }
}
