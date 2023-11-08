package org.example.behaviour_patterns.iterator_design_pattern;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        CollectionOfNames c = new CollectionOfNames();
        for(Iterator i = c.getIterator();i.hasNext();){
            String name = (String) i.next();
            System.out.println(name);
        }
    }
}
