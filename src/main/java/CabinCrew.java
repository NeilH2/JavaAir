public class CabinCrew {

    private CabinCrewType cabinCrewType;

    public CabinCrew(CabinCrewType cabinCrewType) {
        this.cabinCrewType = cabinCrewType;
    }

    public CabinCrewType getCabinCrewType(){
        return this.cabinCrewType;
    }

    public String getValueFromEnum() { //ADDED METHOD
        return this.cabinCrewType.getValue();
    }

}
