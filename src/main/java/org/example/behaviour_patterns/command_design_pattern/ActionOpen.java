package org.example.behaviour_patterns.command_design_pattern;

public class ActionOpen implements ActionListenerCommand{
    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}
