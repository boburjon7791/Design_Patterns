package org.example.structural_patterns.bridge_design_pattern;

public class QuestionManager {
    protected Question question;
    public String catalog;
    public QuestionManager(String catalog){
        this.catalog=catalog;
    }
    public void next(){
        this.question.nextQuestion();
    }
    public void previous(){
        this.question.previousQuestion();
    }
    public void newOne(String quest){
        this.question.newQuestion(quest);
    }
    public void delete(String quest){
        this.question.deleteQuestion(quest);
    }
    public void display(){
        this.question.displayQuestion();
    }
    public void displayAll(){
        this.question.displayAllQuestions();
    }
}
