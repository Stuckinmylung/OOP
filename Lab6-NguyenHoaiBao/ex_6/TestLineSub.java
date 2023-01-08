package lab_6.ex_6;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub ls1 = new LineSub(1,2,3,4);
        LineSub ls2 = new LineSub(new Point(2,3),new Point(4,9));
        System.out.println(ls1);
        System.out.println(ls1.getBegin());
        System.out.println(ls1.getEnd());
        System.out.println(ls1.getGradient());
    }
}
