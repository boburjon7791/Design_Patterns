package org.example.behaviour_patterns.mediator_design_pattern;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoomImpl();
        User user1 = new User(chatRoom);
        user1.setName("Sara");
        user1.sendMessage("Hello, whats up?");
        User user2 = new User(chatRoom);
        user2.setName("Alex");
        user2.sendMessage("Hi, I'm fine. And you?");
    }
}
