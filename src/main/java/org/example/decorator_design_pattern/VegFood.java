package org.example.decorator_design_pattern;

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
