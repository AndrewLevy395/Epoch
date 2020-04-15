package Epoch;

abstract class Card {
    private String name;
    private Integer cost;
    private Integer handLocation;

    public Card(String name, Integer cost){
        this.name = name;
        this.cost = cost;
    }

    abstract Integer getAttack();
    abstract Integer getDefense();

    public String getName(){
        return this.name;
    }

    /**
     * Get the cost of the card
     * @return Cost of card as an Integer
     */
    public Integer getCost(){
        return this.cost;
    }

    /**
     * Set the hand location number of the card
     * @param loc Hand location number as type Integer to be set
     */
    public void setHandLocation(Integer loc){
        this.handLocation = loc;
    }

    /**
     * Get the hand location number of the card
     * @return Hand location number as type Integer
     */
    public Integer getHandLocation(){
        return this.handLocation;
    }
}
