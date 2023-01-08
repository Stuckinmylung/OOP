package lab_7.Ex5;

public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(4.0);
        System.out.println(c1);
        System.out.println("Circle's Area : " + c1.getArea());
        System.out.println("Circle's Perimeter :" + c1.getPerimeter());
        Resizeable rc1 = new ResizeableCircle(3.0);
        System.out.println(rc1);
        rc1.resize(20);
        System.out.println(rc1);
        System.out.println("ResizeableCircle Area's : " + ((Circle)rc1).getArea());
    }
}
