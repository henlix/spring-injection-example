package org.sopt.spring.injection.phone.impl;

import org.sopt.spring.injection.chipset.base.Chipset;
import org.sopt.spring.injection.phone.base.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mi extends Phone {

    @Autowired
    @Qualifier("apq8084")
    private Chipset ap;


    @Override
    public Chipset getCpu() { return ap; }

    @Override
    public void setCpu(Chipset cpu) { this.ap = cpu; }



    @Override
    public String manufacturer() { return "Xiaomi"; }
}
