package lab_6.ex_3;

public class TestMain {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3,4);
        System.out.println(p1);
        p1.setXY(2.1f,4);
        System.out.println(p1);
        Point3D p2 = new Point3D(1,2,3);
        System.out.println(p2.getXYZ());
        System.out.println(p2);
        p2.setXYZ(1,5,6);
        System.out.println(p2);
    }
}
