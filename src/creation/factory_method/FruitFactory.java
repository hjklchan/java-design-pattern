package creation.factory_method;

public abstract class FruitFactory<T extends AbstractFruit> {
    public abstract T getFruit();
}

class AppleFactory extends FruitFactory<Apple> {
    @Override
    public Apple getFruit() {
        return new Apple();
    }
}

class OrangeFactory extends FruitFactory<Orange> {
    @Override
    public Orange getFruit() {
        return new Orange();
    }
}