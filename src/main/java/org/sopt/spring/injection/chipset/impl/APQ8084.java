package org.sopt.spring.injection.chipset.impl;

import org.sopt.spring.injection.chipset.base.Chipset;

public class APQ8084 implements Chipset {

    @Override
    public String architecture() { return "ARMv7-A / 64 bit : 4 core (2.7 GHz)"; }

    @Override
    public String manufacturer() { return "Qualcomm"; }
}
