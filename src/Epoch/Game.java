package Epoch;

import java.util.ArrayList;

public class Game {

    private Team userTeam;
    private Team oppTeam;
    private ArrayList<Leader> allLeaders= new ArrayList<Leader>();

    public Game(){

        createLeaders();

        this.userTeam = new Team(allLeaders.get(0));
        this.oppTeam = new Team(allLeaders.get(1));

        System.out.println(userTeam.getEpoch().getName() + ":");
        userTeam.printHand();

        System.out.println(oppTeam.getEpoch().getName() + ":");
        oppTeam.printHand();
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

    /**
     * Gets the opponents team info
     * @return Opponents team info as type team
     */
    public Team getOppTeam(){
        return this.oppTeam;
    }

    /**
     * Gets the opponents team info
     * @return Opponents team info as type team
     */
    public Team getUserTeam(){
        return this.userTeam;
    }
}
