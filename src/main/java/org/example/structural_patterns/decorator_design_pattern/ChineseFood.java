package org.example.structural_patterns.decorator_design_pattern;

public class ChineseFood extends FoodDecorator{
    public ChineseFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+" with fried rice and manchurian";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+65d;
    }
}
