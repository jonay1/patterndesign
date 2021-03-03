package cn.jonay.patterndesign.创建型.抽象工厂模式;


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
            ProductA a = factory.createA();
            a.play();
            ProductB b = factory.createB();
            b.play();
        }
        {
            Factory factory = new FactoryB();
            ProductA a = factory.createA();
            a.play();
            ProductB b = factory.createB();
            b.play();
        }

    }
}
