package cn.xy.design.pattern.strategy;

import cn.xy.design.pattern.strategy.cpu.ICPU;
import cn.xy.design.pattern.strategy.gpu.IGPU;
import cn.xy.design.pattern.strategy.os.IOS;

/**
  * @description 电脑实体类
  * @author xy
  */
public class Computer {
    private String name;
    private ICPU cpu;
    private IGPU gpu;
    private IOS os;

    @Override
    public String toString() {
        return String.format("name: %s, cpu: %s, gpu: %s, os: %s", name, cpu.name(), gpu.name(), os.name());
    }

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        this.name = name;
        return this;
    }

    public ICPU getCpu() {
        return cpu;
    }

    public Computer setCpu(ICPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public IGPU getGpu() {
        return gpu;
    }

    public Computer setGpu(IGPU gpu) {
        this.gpu = gpu;
        return this;
    }

    public IOS getOs() {
        return os;
    }

    public Computer setOs(IOS os) {
        this.os = os;
        return this;
    }
}
