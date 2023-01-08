package lab_7.Ex1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return getLength();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
