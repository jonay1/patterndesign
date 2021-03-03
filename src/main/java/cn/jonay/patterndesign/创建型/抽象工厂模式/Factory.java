package cn.jonay.patterndesign.创建型.抽象工厂模式;

/**
 * 说明
 *
 * @author zhaozhiguo
 * @version 1.0
 * @date 2021/3/3 10:19
 */
public interface Factory {
    ProductA createA();
    ProductB createB();
}
