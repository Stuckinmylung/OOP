package lab_7.Ex2;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(3.0);
        Rectangle r1 = new Rectangle( 2.0,3.0);
        System.out.println(c1);
        System.out.println("Circle's Area is " + c1.getArea());
        System.out.println("Circle's Perimeter is " + c1.getPerimeter());
        System.out.println(r1);
        System.out.println("Rectangle's Area is " +r1.getArea());
        System.out.println( "Rectangle's Perimeter is " +r1.getPerimeter());
    }
}
