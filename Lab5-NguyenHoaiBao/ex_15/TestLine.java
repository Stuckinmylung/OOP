package lab_5.ex_15;

public class TestLine {
    public static void main(String[] args) {
        MyLine ml1 = new MyLine(new MyPoint(2,4),new MyPoint(5,6));
        System.out.println(ml1.getBeginX());
        System.out.println(ml1.getEndX());
        MyLine ml2 = new MyLine(6,7,8,2);
        System.out.println(ml2);
        ml2.setBeginX(5);
        System.out.println(ml2);
        System.out.println(ml1.getGradient());
        System.out.println(ml2.getLength());
    }
}
