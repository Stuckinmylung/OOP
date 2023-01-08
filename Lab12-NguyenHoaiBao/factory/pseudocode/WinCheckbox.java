package lab12.factory.pseudocode;

public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Render a checkbox in Window style");
    }
}
