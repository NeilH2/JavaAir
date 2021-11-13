public enum CabinCrewType {

    SINGLE("Captain"),
    DOUBLE("First Officer"),
    TRIPLE("Purser"),
    FAMILY("Flight Attendant");


    private final String  rank;

    CabinCrewType(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }




}
