package cn.xy.design.pattern.strategy.cpu;

/** 
  * @description
  * @author xy
  */
public class InterCPU implements ICPU {
    @Override
    public String name() {
        return "inter cpu";
    }
}
