package org.example.behaviour_patterns.memento_design_pattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        careTaker.add(originator.saveState());
        originator.setState("State 2");
        careTaker.add(originator.saveState());
        originator.setState("State 3");
        careTaker.add(originator.saveState());

        System.out.println("Current State="+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second Saved State="+originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First Saved State="+originator.getState());
    }
}
