package org.example.behavioral_patterns.strategy_design_pattern;

import java.util.Scanner;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float v = scanner.nextFloat();
        float v2 = scanner.nextFloat();

        Context context = new Context(new Addition());
        System.out.println("Addition :"+context.executeStrategy(v, v2));

        context=new Context(new Subtraction());
        System.out.println("Subtraction :"+context.executeStrategy(v, v2));

        context=new Context(new Multiplication());
        System.out.println("Multiplication :"+context.executeStrategy(v, v2));
    }
}
