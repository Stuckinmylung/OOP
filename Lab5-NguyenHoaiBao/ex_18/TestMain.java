package lab_5.ex_18;

public class TestMain {
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint(1, 1);
        MyPoint mp2 = new MyPoint(3, 3);
        MyRectangle rectangle = new MyRectangle(mp1, mp2);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
    }
}
