package org.example.structural_patterns.flyweight_design_pattern;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static final Map<String, Player> players=new HashMap<>();
    public static Player getPlayer(String type){
        Player p = null;
        if(players.containsKey(type)){
            p=players.get(type);
        }else {
            switch (type) {
                case "Terrorist"->{
                    System.out.println("Terrorist created");
                    p=new Terrorist();
                }
                case "Counter-Terrorist"->{
                    System.out.println("Counter-Terrorist created");
                    p=new CounterTerrorist();
                }
                default->
                    System.out.println("Wrong input");
            }
            players.put(type,p);
        }
        return p;
    }
}
