package org.example.structural_patterns.decorator_design_pattern;

import lombok.SneakyThrows;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DecoratorPatternCustomer {
    @SneakyThrows
    public static void main(String[] args) {
        do {
            System.out.println("""
                    ===Food Menu===
                    1. Vegetarian Food
                    2. Non Vegetarian Food
                    3. Chinese food
                    4. Exit
                    
                    Enter your choice
                    """);
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice==4) {
                break;
            }
            System.out.println(choice);
            switch (choice) {
                case 1->{
                    Food vf = new VegFood();
                    System.out.println(vf.prepareFood());
                    System.out.println(vf.foodPrice());
                }
                case 2->{
                    Food nvf = new NonVegFood(new VegFood());
                    System.out.println(nvf.prepareFood());
                    System.out.println(nvf.foodPrice());
                }
                case 3->{
                    Food cf = new ChineseFood(new VegFood());
                    System.out.println(cf.prepareFood());
                    System.out.println(cf.foodPrice());
                }
                default-> {
                    System.out.println("Wrong choice !");
                }
            }
            TimeUnit.SECONDS.sleep(2);
        }while (true);
    }
}
