package org.example.behaviour_patterns.command_design_pattern;

public class CommandPatternClient {
    public static void main(String[] args) {
        Document document = new Document();

        ActionListenerCommand clickOpen=new ActionOpen(document);
        ActionListenerCommand clickSave=new ActionSave(document);

        MenuOption menuOption= new MenuOption(clickOpen, clickSave);

        menuOption.clickOpen();
        menuOption.clickSave();
    }
}
