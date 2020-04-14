package Epoch;

public class Leader {
    private String name;
    private Epoch epoch;

    public Leader(String name, Epoch epoch){
        this.name = name;
        this.epoch = epoch;
    }

    public String getName(){
        return this.name;
    }

    public Epoch getEpoch(){
        return this.epoch;
    }
}
