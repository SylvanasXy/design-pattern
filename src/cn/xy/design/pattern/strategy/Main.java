package cn.xy.design.pattern.strategy;

import cn.xy.design.pattern.strategy.cpu.AMDCPU;
import cn.xy.design.pattern.strategy.cpu.InterCPU;
import cn.xy.design.pattern.strategy.gpu.AMDGPU;
import cn.xy.design.pattern.strategy.gpu.NvidiaGPU;
import cn.xy.design.pattern.strategy.os.MacOS;
import cn.xy.design.pattern.strategy.os.WindowsOS;

/**
  * @description 示例场景:
 *               可根据选择组装电脑, os / cpu / gpu等都可任意更换
  * @author xy
  */
public class Main {
    public static void main(String[] args) {
        Computer computerOne = new Computer();
        computerOne.setName("amdComputer").setCpu(new AMDCPU()).setGpu(new AMDGPU()).setOs(new WindowsOS());
        System.out.println(computerOne.toString());

        Computer computerTwo = new Computer();
        computerTwo.setName("interComputer").setCpu(new InterCPU()).setGpu(new NvidiaGPU()).setOs(new MacOS());
        System.out.println(computerTwo.toString());
    }
}
