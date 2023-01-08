package lab_6.ex_4;

public class TestMain {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];
        shapes[0] = new Rectangle(1,4);
        shapes[1] = new Square(2);
        shapes[2] = new Circle(3);
        shapes [3] = new Shape("green",true);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println();
        }
    }
}
