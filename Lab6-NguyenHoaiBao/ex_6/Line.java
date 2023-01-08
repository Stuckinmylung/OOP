package lab_6.ex_6;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginy, int endX, int endY) {
        this.begin = new Point(beginX, beginy);
        this.end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = this.begin.getX() - this.end.getX();
        int yDiff = this.begin.getY() - this.end.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = this.begin.getX() - this.end.getX();
        int yDiff = this.begin.getY() - this.end.getY();
        return Math.atan2(yDiff, xDiff);
    }

}
