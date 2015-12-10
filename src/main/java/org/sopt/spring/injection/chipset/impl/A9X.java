package org.sopt.spring.injection.chipset.impl;

import org.sopt.spring.injection.chipset.base.Chipset;

public class A9X implements Chipset {

    @Override
    public String architecture() { return "ARMv8-A / 64 bit : 2 core (2.26 GHz)"; }

    @Override
    public String manufacturer() { return "Apple"; }
}
