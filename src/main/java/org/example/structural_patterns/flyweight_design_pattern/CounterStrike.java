package org.example.structural_patterns.flyweight_design_pattern;

import java.util.Random;

public class CounterStrike {
    public static final String[] playerType={"Counter-Terrorist","Terrorist"};
    private static final String[] weapons={"Ak-K-74","Maverick","Gut Knife","Desert Eagle"};
    private static final Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandPlayerType());
            player.assignWeapon(getRandWeapon());
            player.mission();
        }
    }
    private static String getRandPlayerType(){
        int randInt = random.nextInt(playerType.length);
        return playerType[randInt];
    }
    private static String getRandWeapon(){
        int randInt = random.nextInt(weapons.length);
        return weapons[randInt];
    }
}
