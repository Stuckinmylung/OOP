package lab13.decorator.uml_2;

public class ToppingDecoratorDemo {
    public static void main(String[] args) {
        IceCream stb = new StrawberryIceCream();
        IceCream vnl = new VanillaIceCream();

        ToppingDecorator hnstb = new HoneyToppingDecorator(stb);
        System.out.println(hnstb.getDescription());
        ToppingDecorator vnln = new NutsToppingDecorator(vnl);
        System.out.println(vnln.getDescription());
    }
}
