package Epoch;

import java.util.ArrayList;

public class Epoch {
    private String name;
    private ArrayList<Card> allCards = new ArrayList<Card>();

    public Epoch(String name){
        this.name = name;
        setAllCards();
    }

    public void setAllCards(){
        Card testCard1 = new Card("Test1", 1,1,2);
        Card testCard2 = new Card("Test2",1,2,3);
        Card testCard3 = new Card("Test3",5,5,6);
        allCards.add(testCard1);
        allCards.add(testCard2);
        allCards.add(testCard3);
    }

    public String getName(){
        return this.name;
    }

    public void printCards(){
        for(Card c : allCards){
            System.out.println(c.getName());
        }
    }
}
