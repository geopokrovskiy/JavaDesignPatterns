package org.example.structural.flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class RaidFactory {
    private static final Map<String, Player> players = new HashMap<>();

    public Player getPlayerBySpeciality(String speciality){
        Player player = players.get(speciality);
        if(player == null){
            switch (speciality){
                case "Healer":
                    System.out.println("Inviting the healer to the raid...");
                    player = new Healer();
                    break;
                case "DamageDealer":
                    System.out.println("Inviting the DD to the raid...");
                    player = new DamageDealer();
                    break;
                case "Tank":
                    System.out.println("Inviting the tank to the raid...");
                    player = new Tank();
                    break;
            }
            players.put(speciality, player);
        }
        return player;
    }
}
