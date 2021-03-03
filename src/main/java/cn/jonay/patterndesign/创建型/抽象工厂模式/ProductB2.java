package cn.jonay.patterndesign.创建型.抽象工厂模式;

/**
 * 说明
 *
 * @author zhaozhiguo
 * @version 1.0
 * @date 2021/3/3 10:07
 */
public class ProductB2 implements ProductB {
    @Override
    public void play() {
        System.out.println("我是" + getClass().getSimpleName());
    }
}
