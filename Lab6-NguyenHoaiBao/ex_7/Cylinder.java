package lab_6.ex_7;

import lab_6.Circle.Circle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }
    public double getArea(){
        return 2*Math.PI * base.getRadius() * height + 2*base.getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getVolume(){
        return base.getArea() * getHeight();
    }
}
