package org.example.behaviour_patterns.state_design_pattern;

import java.util.Scanner;

public class StatePatternDemo {
    static Controller controller;
    public static void main(String[] args) {
        controller=new Controller();
        String con=new Scanner(System.in).nextLine();
        if(con.equalsIgnoreCase("management")) {
            controller.setManagementConnection(new Management());
        }
        else if (con.equalsIgnoreCase("sales")) {
            controller.setSalesConnection(new Sales());
        }
        else if(con.equalsIgnoreCase("accounting")) {
            controller.setAccountingConnection(new Accounting());
        }

        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }
}
