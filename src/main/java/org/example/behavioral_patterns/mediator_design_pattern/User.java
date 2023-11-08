package org.example.behavioral_patterns.mediator_design_pattern;

public class User extends Participant{
    private String name;
    private final ChatRoom chatRoom;
    public User(ChatRoom chatRoom){
        this.chatRoom=chatRoom;
    }
    @Override
    public void sendMessage(String msg) {
        chatRoom.showMessage(msg, this);
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
