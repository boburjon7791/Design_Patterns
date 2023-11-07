package org.example.structural_patterns.decorator_design_pattern;

public class VegFood implements Food{
    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    @Override
    public double foodPrice() {
        return 50d;
    }
}
