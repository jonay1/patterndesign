package cn.jonay.patterndesign.创建型.简单工厂模式;

/**
 * 说明
 *
 * @author zhaozhiguo
 * @version 1.0
 * @date 2021/3/3 10:06
 */
public class SimpleFactory {
    public Product create(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}
