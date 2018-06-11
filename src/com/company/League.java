package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> leagues = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (leagues.contains(team)) {
            System.out.println(team.getName() + " is already on the league");
            return false;
        } else {
            leagues.add(team);
            System.out.println(team.getName() + " picked for league " + this.name);
            return true;
        }
    }

    public void showLeagues() {
        Collections.sort(leagues);
        for(T team : leagues) {
            System.out.println(team.getName() + " : " + team.ranking());
        }
    }


}
