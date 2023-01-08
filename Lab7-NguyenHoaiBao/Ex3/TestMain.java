package lab_7.Ex3;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint mv1 = new MovablePoint(7, 8, 1, 1);
        System.out.println("Begin Point : " +
                mv1);
        mv1.moveDown();
        System.out.println("MVPoint after move Down : " + mv1);
        mv1.moveLeft();
        System.out.println("MVPoint after move Left : " + mv1);
        mv1.moveUp();
        mv1.moveRight();
        System.out.println("MVPoint after move Up and Right : " + mv1);

    }
}
