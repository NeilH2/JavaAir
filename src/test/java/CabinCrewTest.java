import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrewSingle;
    CabinCrew cabinCrewDouble;
    CabinCrew cabinCrewTriple;
    CabinCrew cabinCrewFamily;

    @Before
    public void before(){
        cabinCrewSingle = new CabinCrew(CabinCrewType.SINGLE, "Dave");
        cabinCrewDouble = new CabinCrew(CabinCrewType.DOUBLE, "James");
        cabinCrewTriple = new CabinCrew(CabinCrewType.TRIPLE, "Sandra");
        cabinCrewFamily = new CabinCrew(CabinCrewType.FAMILY, "Betty");

    }

    @Test
    public void crewMemberHasName(){
        assertEquals("Dave", cabinCrewSingle.getCrewMemberName());
    }

    @Test
    public void canGetCabinCrewType(){
        assertEquals(CabinCrewType.SINGLE, cabinCrewSingle.getCabinCrewType());
    }

    @Test
    public void singleHasRankCaptain(){
        assertEquals("Captain", cabinCrewSingle.getRank());
    }

    @Test
    public void doubleHasRankFirstOfficer(){
        assertEquals("First Officer", cabinCrewDouble.getRank());
    }


    @Test
    public void tripleHasRankPurser(){
        assertEquals("Purser", cabinCrewTriple.getRank());
    }

    @Test
    public void familyHasRankFlightAttendant(){
        assertEquals("Flight Attendant", cabinCrewFamily.getRank());

    }

}
