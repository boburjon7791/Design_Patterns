package org.example.behaviour_patterns.mediator_design_pattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoomImpl implements ChatRoom {
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();
    @Override
    public void showMessage(String msg, Participant p) {
        System.out.println(p.getName()+" get message :"+msg);
        System.out.println(dateFormat.format(date));
    }
}
