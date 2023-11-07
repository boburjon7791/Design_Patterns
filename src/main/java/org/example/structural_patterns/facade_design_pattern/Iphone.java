package org.example.structural_patterns.facade_design_pattern;

public class Iphone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Iphone 6");
    }

    @Override
    public void price() {
        System.out.println("700.00 $");
    }
}
