package org.example.structural.flyweight;

import org.example.structural.flyweight.model.*;

import java.util.ArrayList;
import java.util.List;

public class Raid {
    public static void main(String[] args) {
        RaidFactory raidFactory = new RaidFactory();
        List<Player> playerList = new ArrayList<>();
        playerList.add(raidFactory.getPlayerBySpeciality("DamageDealer"));
        playerList.add(raidFactory.getPlayerBySpeciality("DamageDealer"));
        playerList.add(raidFactory.getPlayerBySpeciality("DamageDealer"));
        playerList.add(raidFactory.getPlayerBySpeciality("Tank"));
        playerList.add(raidFactory.getPlayerBySpeciality("Healer"));

        for(Player player : playerList){
            player.doJob();
        }
    }
}
