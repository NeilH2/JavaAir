package people;

public class CabinCrewMember extends Person {

    private Rank rank;

    public CabinCrewMember(String name, Rank rank){
        super(name);
        this.rank = rank;
    }

    public Rank getRank(){ return rank; }

    public String relayMessagesToPassenger(){
        return "Please remain seated during take off";
    }
}
