package cn.jonay.patterndesign.创建型.工厂方法模式;


/**
 * 说明
 *
 * @author zhaozhiguo
 * @version 1.0
 * @date 2021/3/3 10:09
 */
public class Main {
    public static void main(String[] args) {
        {
            Factory factory = new FactoryA();
            Product product = factory.create();
            product.play();
        }
        {
            Factory factory = new FactoryB();
            Product product = factory.create();
            product.play();
        }

    }
}
