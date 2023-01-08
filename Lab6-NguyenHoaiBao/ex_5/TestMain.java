package lab_6.ex_5;

public class TestMain {
    public static void main(String[] args) {


        Mammal Ecat = new Cat("Cho");
        Mammal EDog = new Dog("Meo");
        Mammal EDog_1 = new Dog("Mieu");
        System.out.println((Cat)Ecat);
        System.out.println((Dog)EDog);
        ((Cat) Ecat).greets();
        ((Dog) EDog_1).greets();
        ((Dog) EDog_1).greets((Dog)EDog);

    }

}
