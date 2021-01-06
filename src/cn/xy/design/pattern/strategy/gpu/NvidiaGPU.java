package cn.xy.design.pattern.strategy.gpu;

/** 
  * @description
  * @author xy
  */
public class NvidiaGPU implements IGPU {
    @Override
    public String name() {
        return "nvidia gpu";
    }
}
