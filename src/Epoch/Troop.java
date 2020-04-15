package Epoch;

public class Troop extends Card {
    private Integer attack;
    private Integer defense;

    public Troop(String name, Integer cost, Integer attack, Integer defense){
        super(name, cost);
        this.attack = attack;
        this.defense = defense;
    }

    public Integer getAttack(){
        return this.attack;
    }

    public Integer getDefense(){
        return this.defense;
    }
}
