package cn.xy.design.pattern.singleton;

/** 
  * @description 饿汉模式
 *               项目启动时就会创建对象, 不会有线程安全问题.
 *               只是该对象不是懒加载, 即时不用对象, 也会实例化对象, 可能会存在一定的内存空间的浪费(可忽略不计)
  * @author xy
  */
public class Hungry {
    private Hungry() {}
    private static Hungry instance = new Hungry();

    public static Hungry getInstance() {
        return instance;
    }
}
