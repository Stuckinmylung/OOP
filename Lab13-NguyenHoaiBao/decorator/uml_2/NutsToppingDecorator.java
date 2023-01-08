package lab13.decorator.uml_2;

public class NutsToppingDecorator extends ToppingDecorator{
    protected IceCream IceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        IceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return IceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " with topping nuts";
    }
}
