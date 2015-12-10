package org.sopt.spring.injection.phone.base;

import org.sopt.spring.injection.chipset.base.Chipset;
import org.sopt.spring.injection.chipset.impl.Exynos;

public class Phone {

    protected Chipset cpu;

    public Chipset getCpu() { return cpu; }
    public void setCpu(Chipset cpu) { this.cpu = cpu; }

    public Phone() { cpu = new Exynos(); }
    public Phone(Chipset cpu) { setCpu(cpu); }

    public String manufacturer() { return "UNDEFINED"; }
}
