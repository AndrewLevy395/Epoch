package Epoch;

import java.util.ArrayList;

public class Game {

    public ArrayList<Leader> allLeaders= new ArrayList<Leader>();

    public Game(){

        createLeaders();

        Team userTeam = new Team(allLeaders.get(0));
        Team oppTeam = new Team(allLeaders.get(1));

        System.out.println(userTeam.getEpoch().getName() + ":");
        userTeam.getEpoch().printCards();

        System.out.println(oppTeam.getEpoch().getName() + ":");
        oppTeam.getEpoch().printCards();
    }

    /**
     * Creates all leaders as well as their respective epochs
     */
    public void createLeaders(){
        Epoch roman = new Epoch("Roman");                   //Roman Epoch
        Epoch modern = new Epoch("Modern");                 //Modern Epoch

        allLeaders.add(new Leader("Emperor", roman));       //Emperor - Roman
        allLeaders.add(new Leader("President", modern));    //President - Modern
    }
}
