package people;

public class Pilot extends CabinCrewMember {

    private String pilotLicenceNum;

    public Pilot(String name, Rank rank, String pilotLicenceNum){
        super(name, rank);
        this.pilotLicenceNum = pilotLicenceNum;
    }

    public String getPilotLicenceNum(){ return pilotLicenceNum; }

    public String flyPlane(){
        return "This is your Captain speaking, we are ready for take off";
    }
}
