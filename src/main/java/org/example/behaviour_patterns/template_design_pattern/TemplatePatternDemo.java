package org.example.behaviour_patterns.template_design_pattern;

public class TemplatePatternDemo {
    public static void main(String[] args){
        Game soccer = new Soccer();
        soccer.initialize();
        soccer.start();
        soccer.play();
        soccer.end();
        System.out.println();
        Game chess=new Chess();
        chess.initialize();
        chess.start();
        chess.play();
        chess.end();
    }
}
