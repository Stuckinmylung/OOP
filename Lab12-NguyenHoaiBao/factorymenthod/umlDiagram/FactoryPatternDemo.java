package lab12.factorymenthod.umlDiagram;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        Fruit fruit = factory.getFruit("apple");
        fruit.produceJuice();
        fruit = factory.getFruit("orange");
        fruit.produceJuice();
        fruit = factory.getFruit("banana");
        fruit.produceJuice();
    }

}
