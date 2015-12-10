package org.sopt.spring.injection.chipset.impl;

import org.sopt.spring.injection.chipset.base.Chipset;

public class Silvermont implements Chipset {

    @Override
    public String architecture() { return "C3440 / 32 bit : 2 Core (1.4 GHz)"; }

    @Override
    public String manufacturer() { return "Intel"; }
}
