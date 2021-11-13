public enum CabinCrewType {

    SINGLE("Captain"),
    DOUBLE("First Officer"),
    TRIPLE("Purser"),
    FAMILY("Flight Attendant");


    private final String  value;

    CabinCrewType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }




}
