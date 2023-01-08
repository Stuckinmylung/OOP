package lab_7.ex8;

public class MovableRectangle {
    private MovablePoint topLeft;
    private MovablePoint topRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
    topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
    topRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle[" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                ']';
    }

    public void moveUp() {
        topRight.y -= topRight.ySpeed;
        topLeft.y -= topLeft.ySpeed;
    }

    public void moveDown() {
        topRight.y += topRight.ySpeed;
        topLeft.y += topLeft.ySpeed;
    }

    public void moveLeft() {
        topRight.x -= topRight.xSpeed;
        topLeft.x -= topLeft.xSpeed;
    }

    public void moveRight() {
        topRight.x += topRight.xSpeed;
        topLeft.x += topLeft.xSpeed;
    }
}
