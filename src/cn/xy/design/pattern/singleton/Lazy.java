package cn.xy.design.pattern.singleton;

/** 
  * @description 懒汉模式 - 双重校验
 *               这里直接写了双重校验模式, 没写那些线程不安全 / 效率较低的单例模式
 *               该模式会在使用对象时才去实例化对象
 *
  * @author xy
  */
public class Lazy {
    private Lazy() {}

    /**
     * 需要加volatile关键字, 否则会出现错误.
     * 问题的原因在于JVM指令重排优化的存在.
     * 在某个线程创建单例对象时, 在构造方法被调用之前, 就为该对象分配了内存空间并将对象的字段设置为默认值.
     * 此时就可以将分配的内存地址赋值给instance字段了, 然而该对象可能还没有初始化. 若紧接着另外一个线程来调用getInstance, 取到的就是状态不正确的对象, 程序就会出错.
     */
    private volatile static Lazy instance = null;

    public static Lazy getInstance() {
        if (instance == null) {
            synchronized (Lazy.class) {
                if (instance == null) {
                    return new Lazy();
                }
            }
        }
        return instance;
    }
}
