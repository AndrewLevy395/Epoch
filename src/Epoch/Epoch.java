package Epoch;

import java.util.ArrayList;
import java.util.Random;

public class Epoch {
    private String name;
    private ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Card> allCards = new ArrayList<Card>();

    public Epoch(String name){
        this.name = name;
        setAllCards();
        setNewDeck();
    }

    /**
     * Gets all cards in that leader's deck and sets the list of all cards
     */
    public void setAllCards(){
        Card testCard1 = new Troop("Pleb", 2,1,1);
        Card testCard2 = new Troop("Canis",3,2,1);
        Card testCard3 = new Troop("Neptune",8,8,6);
        Card testCard4 = new Troop("Cupid",5,6,1);
        Card testCard5 = new Element("Law", 2);
        Card testCard6 = new Element("Religion", 4);
        allCards.add(testCard1);
        allCards.add(testCard2);
        allCards.add(testCard3);
        allCards.add(testCard4);
        allCards.add(testCard5);
        allCards.add(testCard6);
    }

    /**
     * Create a new deck from the set of all cards
     */
    public void setNewDeck(){
        ArrayList<Card> cloneCards = new ArrayList<Card>(allCards);
        this.deck = cloneCards;
    }

    /**
     * Get the name of the epoch
     * @return The name of the epoch as a string
     */
    public String getName(){
        return this.name;
    }

    /**
     * Return a random card in the deck
     * @return Random card in the deck of type card
     */
    public Card getRandomCard(){
        Random rand = new Random();
        Integer deckSize = deck.size();
        System.out.println(deckSize);
        Integer randomNum = rand.nextInt(deckSize);
        Card randomCard = deck.get(randomNum);
        deck.remove(deck.get(randomNum));
        return randomCard;
    }
}
