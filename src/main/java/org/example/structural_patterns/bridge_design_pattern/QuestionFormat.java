package org.example.structural_patterns.bridge_design_pattern;

public class QuestionFormat extends QuestionManager{
    public QuestionFormat(String catalog) {
        super(catalog);
    }

    @Override
    public void displayAll() {
        System.out.println("----------");
        super.displayAll();
        System.out.println("----------");
    }
}
