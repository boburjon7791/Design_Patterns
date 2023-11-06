package org.example.composite_design_pattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee e1 = new Cashier(0,"Salli",4);
        Employee e2 = new Accountant(1,"Jessi",5);
        Employee manager = new BankManager(2,"Sara",10);
        manager.add(e1);
        manager.add(e2);
        manager.print();
    }
}
