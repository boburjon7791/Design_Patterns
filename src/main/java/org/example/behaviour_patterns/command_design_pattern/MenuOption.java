package org.example.behaviour_patterns.command_design_pattern;

public class MenuOption {
    private ActionListenerCommand open;
    private ActionListenerCommand save;

    public MenuOption(ActionListenerCommand open, ActionListenerCommand save) {
        this.open = open;
        this.save = save;
    }
    public void clickOpen(){
        open.execute();
    }
    public void clickSave(){
        save.execute();
    }
}
