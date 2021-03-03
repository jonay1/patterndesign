package cn.jonay.patterndesign.创建型.工厂方法模式;

/**
 * 说明
 *
 * @author zhaozhiguo
 * @version 1.0
 * @date 2021/3/3 10:07
 */
public class ProductA implements Product {
    @Override
    public void play() {
        System.out.println("我是" + getClass().getSimpleName());
    }
}
