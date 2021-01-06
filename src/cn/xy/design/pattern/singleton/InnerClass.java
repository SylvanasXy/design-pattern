package cn.xy.design.pattern.singleton;

/** 
  * @description 内部类模式
 *               该模式不存在线程安全问题, 也是懒加载对象
 *               原因参考: https://blog.csdn.net/mnb65482/article/details/80458571
  * @author xy
  */
public class InnerClass {
    private InnerClass() {}

    private static class SingletonInnerClass {
        private static InnerClass instance = new InnerClass();
    }

    public static InnerClass getInstance() {
        return SingletonInnerClass.instance;
    }
}
