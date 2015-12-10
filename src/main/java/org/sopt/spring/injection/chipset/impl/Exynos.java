package org.sopt.spring.injection.chipset.impl;

import org.sopt.spring.injection.chipset.base.Chipset;

public class Exynos implements Chipset {

    @Override
    public String architecture() { return "Exynos / 64 bit : 4 core (1.5 GHz) + 4 core (2.1 GHz)"; }

    @Override
    public String manufacturer() { return "Samsung"; }
}
