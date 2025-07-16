package creation.factory_method;

import creation.factory_method.simple_implement.SimpleFruitFactory;

public class Main {
    public static void main(String[] args) {
        useFruitFactoryMethod();
    }

    static void useSimpleFruitFactory() {
        AbstractFruit fruit = SimpleFruitFactory.getFruit("orange");
        System.out.println(fruit.toString());
    }

    static void useFruitFactoryMethod() {
        FruitFactory<?> fruitFactory = new AppleFactory();

        System.out.println(fruitFactory.getFruit());
    }
}
