import java.util.SplittableRandom;

public class CabinCrew {

    private CabinCrewType cabinCrewType;
    private String name;


    public CabinCrew(CabinCrewType cabinCrewType, String name) {
        this.cabinCrewType = cabinCrewType;
        this.name = name;
    }

    public CabinCrewType getCabinCrewType(){
        return this.cabinCrewType;
    }

    public String getRank() {
        return this.cabinCrewType.getRank();
    }

    public String getCrewMemberName() {
        return name;
    }
}
