package creation.factory_method.simple_implement;

import creation.factory_method.AbstractFruit;
import creation.factory_method.Apple;
import creation.factory_method.Orange;
import creation.factory_method.Watermelon;

public class SimpleFruitFactory {
    // 获取水果直接向工厂要，而不是自己去创建。
    public static AbstractFruit getFruit(String type) {
        switch (type) {
            case "apple":
                return new Apple();
            case "watermelon":
                return new Watermelon();
            // 注册新水果并返回实例
            // FIXME 但是仍然不符合开闭原则，因为新增新的水果还是修改了工厂类的代码。
            case "orange":
                return new Orange();
            default:
                return null;
        }
    }
}
