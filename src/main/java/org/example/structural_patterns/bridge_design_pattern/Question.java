package org.example.structural_patterns.bridge_design_pattern;

public interface Question {
    void nextQuestion();
    void previousQuestion();
    void newQuestion(String q);
    void deleteQuestion(String q);
    void displayQuestion();
    void displayAllQuestions();
}
