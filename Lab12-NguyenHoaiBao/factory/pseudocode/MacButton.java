package lab12.factory.pseudocode;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Render a button in macOS style");
    }
}
