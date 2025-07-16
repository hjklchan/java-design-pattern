package creation.abstract_factory.buttons;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("You have created MacOSButton");
    }
}
