package Epoch;

public class Card {
    private String name;
    private Integer attack;
    private Integer defense;
    private Integer cost;

    public Card(String name, Integer attack, Integer defense, Integer cost){
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.cost = cost;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAttack(){
        return this.attack;
    }

    public Integer getDefense(){
        return this.defense;
    }

    public Integer getCost(){
        return this.cost;
    }
}
