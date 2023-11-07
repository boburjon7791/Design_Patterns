package org.example.structural_patterns.facade_design_pattern;

public class Xiaomi implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Xiaomi 10 pro max");
    }

    @Override
    public void price() {
        System.out.println("1.500.00 $");
    }
}
