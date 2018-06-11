package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
       // ArrayList<Team> teams;
       // Collections.sort(teams);

        /**
         * Create a generic class to implement a league table for a sport.
         * The class should allow teams to be added to the list, and store
         * a list of teams that belong to the league.
         * (use the generics class project to implement teams and players)
         *
         * The class should have a method to print out the teams in order,
         * with the team at the top of the list printed first.
         *
         * Only teams of a particular type should be added to any particular
         * instance of the league class - the program should fail to compile if
         * an attempt is made to add an incompatible team
         */

        // create league
        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        League<Team<BaseballPlayer>> baseballLeague = new League<>("National");

        System.out.println("--- Add Football teams to league ---");
        Team<FootballPlayer> colts = new Team<>("Colts");
        Team<FootballPlayer> broncos = new Team<>("Broncos");
        Team<FootballPlayer> raiders = new Team<>("Raiders");
        footballLeague.addTeam(colts);
        footballLeague.addTeam(broncos);
        footballLeague.addTeam(raiders);

        System.out.println("--- Add Baseball teams to league ---");
        Team<BaseballPlayer> dogers = new Team<>("Dogers");
        Team<BaseballPlayer> cubs = new Team<>("Cubs");
        Team<BaseballPlayer> rockies = new Team<>("Rockies");
        baseballLeague.addTeam(dogers);
        baseballLeague.addTeam(cubs);
        baseballLeague.addTeam(rockies);

        System.out.println("--- Football game results ---");
        colts.matchResult(broncos, 7, 14);
        colts.matchResult(broncos, 24, 3);
        broncos.matchResult(colts, 28, 17);
        broncos.matchResult(colts, 7, 24);
        raiders.matchResult(colts, 7, 7);

        System.out.println("--- Baseball game results ---");
        dogers.matchResult(cubs,12,7);
        cubs.matchResult(rockies, 6, 3);
        rockies.matchResult(dogers, 3, 17);
        dogers.matchResult(rockies, 7, 7);

        System.out.println("---League Results---");
        footballLeague.showLeagues();
        System.out.println("-------------");
        baseballLeague.showLeagues();

    }
}
