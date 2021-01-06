package cn.xy.design.pattern.strategy.gpu;

/** 
  * @description
  * @author xy
  */
public class AMDGPU implements IGPU {
    @Override
    public String name() {
        return "amd gpu";
    }
}
