package lab13.decorator.uml_2;

public class HoneyToppingDecorator extends ToppingDecorator {
    protected IceCream IceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        IceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return IceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " with topping honey";
    }
}
