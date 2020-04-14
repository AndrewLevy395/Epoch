package Epoch;

public class Team {
    Leader leader;


    public Team(Leader leader){
        this.leader = leader;
    }

    /**
     * Get the type of epoch of the leader of the team
     * @return
     */
    public Epoch getEpoch(){
        return this.leader.getEpoch();
    }
}
