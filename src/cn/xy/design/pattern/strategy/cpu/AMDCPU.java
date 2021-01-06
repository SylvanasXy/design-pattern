package cn.xy.design.pattern.strategy.cpu;

/** 
  * @description
  * @author xy
  */
public class AMDCPU implements ICPU {
    @Override
    public String name() {
        return "amd cpu";
    }
}
