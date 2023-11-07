package org.example.structural_patterns.facade_design_pattern;

public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Samsung galaxy tab 2");
    }

    @Override
    public void price() {
        System.out.println("500.00 $");
    }
}
