package org.example.composite_design_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee{
    private int id;
    private String name;
    private double salary;

    public BankManager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public List<Employee> employees = new ArrayList<>();

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {
        System.out.println("======================");
        System.out.println("Id = "+getId());
        System.out.println("Name = "+getName());
        System.out.println("Salary = "+getSalary());
        System.out.println("======================");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            employee.print();
        }
    }

    @Override
    public void add(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }
}
