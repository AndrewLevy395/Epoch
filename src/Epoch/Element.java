package Epoch;

public class Element extends Card {

    public Element(String name, Integer cost){
        super(name, cost);
    }

    public Integer getAttack(){
        return -1;
    }

    public Integer getDefense(){
        return -1;
    }
}
