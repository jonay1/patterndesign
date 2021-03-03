package cn.jonay.patterndesign.创建型.工厂方法模式;

/**
 * 说明
 *
 * @author zhaozhiguo
 * @version 1.0
 * @date 2021/3/3 10:15
 */
public class FactoryA implements Factory {

    @Override
    public Product create() {
        return new ProductA();
    }
}
