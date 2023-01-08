package lab13.decorator.uml_2;

public abstract class ToppingDecorator implements IceCream{
protected IceCream iceCream;
    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();

}
