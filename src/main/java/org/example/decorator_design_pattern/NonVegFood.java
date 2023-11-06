package org.example.decorator_design_pattern;

public class NonVegFood extends FoodDecorator{
    public NonVegFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+" with roasted chicken and chicken curry";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+150d;
    }
}
