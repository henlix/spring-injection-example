package org.sopt.spring.injection.phone.impl;

import org.sopt.spring.injection.chipset.base.Chipset;
import org.sopt.spring.injection.phone.base.Phone;

import javax.annotation.Resource;

public class Prototype extends Phone {

    @Resource(name = "silvermont")  // Java Standard Injection
    private Chipset ap;


    @Override
    public Chipset getCpu() { return ap; }

    @Override
    public void setCpu(Chipset cpu) { this.ap = cpu; }



    @Override
    public String manufacturer() { return "Intel"; }
}
