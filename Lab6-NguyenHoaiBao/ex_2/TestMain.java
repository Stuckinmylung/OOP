package lab_6.ex_2;

import lab_6.ex_4.Shape;

public class TestMain {
    public static void main(String[] args) {
        Person st1 = new Student("HoaiBao","Ha Tinh","KHDL",2003,1.3);
        System.out.println(st1);
        System.out.println(st1.getName());
        System.out.println(st1.getAddress());
        st1.setAddress("Ha Noi");
        System.out.println(st1);
    }
}
