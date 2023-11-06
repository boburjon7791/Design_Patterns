package org.example.bridge_design_pattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.question=new JavaQuestions();
        questions.delete("What is java?");
        questions.displayAll();
        System.out.println();
        questions.display();
        questions.newOne("What is inheritance?");
        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();
    }
}
