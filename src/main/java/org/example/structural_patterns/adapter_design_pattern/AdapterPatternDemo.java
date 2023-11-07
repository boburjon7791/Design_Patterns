package org.example.structural_patterns.adapter_design_pattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.println(targetInterface.getCreditCard());
    }
}
