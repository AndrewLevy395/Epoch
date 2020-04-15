package Epoch;

import java.util.Random;

public class Team {
    Leader leader;
    Card[] hand = new Card[7];
    Random rand = new Random();

    public Team(Leader leader){
        this.leader = leader;
        addToHand();
        addToHand();
        addToHand();
    }

    /**
     * Get the type of epoch of the leader of the team
     * @return
     */
    public Epoch getEpoch(){
        return this.leader.getEpoch();
    }

    public Leader getLeader(){
        return this.leader;
    }

    public Card[] getHand(){
        return this.hand;
    }

    /**
     * Add a card to a team's hand
     */
    public void addToHand(){
        Boolean fullHand = true;
        for(Integer i = 0; i < 7; i ++) {
            if(hand[i] == null && fullHand){
                hand[i] = getEpoch().getRandomCard();
                hand[i].setHandLocation(i);
                fullHand = false;
            }
        }
        if(fullHand){
            //full hand discard
        }
    }

    /**
     * Prints current hand of team
     * TESTING
     */
    public void printHand(){
        for(Integer i = 0; i < 7; i++){
            if(hand[i] != null){
                System.out.println(hand[i].getName() + " " + hand[i].getHandLocation());
            }
        }
    }

}
