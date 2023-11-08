package org.example.behaviour_patterns.command_design_pattern;

public class ActionSave implements ActionListenerCommand{
    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
