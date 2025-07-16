package creation.factory_method;

// 假设又多了一个新的水果
// 只需要在这个 SimpleFruitFactory 工厂去注册并返回实例就 ok 了
public class Orange extends AbstractFruit {
    public Orange() {
        super("橙子");
    }
}
