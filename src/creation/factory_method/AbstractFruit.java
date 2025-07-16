package creation.factory_method;

public abstract class AbstractFruit {
    private final String name;

    public AbstractFruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
