package creation.abstract_factory.buttons;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("You have created WindowsButton");
    }
}
