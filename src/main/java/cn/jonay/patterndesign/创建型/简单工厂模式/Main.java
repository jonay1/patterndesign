package cn.jonay.patterndesign.创建型.简单工厂模式;

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
            SimpleFactory factory = new SimpleFactory();
            Product product = factory.create("A");
            product.play();
        }
        {
            SimpleFactory factory = new SimpleFactory();
            Product product = factory.create("B");
            product.play();
        }
    }
}
