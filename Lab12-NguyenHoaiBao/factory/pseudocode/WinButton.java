package lab12.factory.pseudocode;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Render a button in Window style");
    }
}
