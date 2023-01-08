package lab12.factorymenthod.umlDiagram;

public class FruitFactory {
    Fruit getFruit(String name) {
        switch (name) {
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            case "banana":
                return new Banana();
        }
        throw new RuntimeException("No matching object could be created");
    }
}
