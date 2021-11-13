import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew(CabinCrewType.DOUBLE, "James");
    }

    @Test
    public void canGetCabinCrewType(){
        assertEquals(CabinCrewType.DOUBLE, cabinCrew.getCabinCrewType());
    }

    @Test
    public void doubleHasValueFirstOfficer(){
        assertEquals("First Officer", cabinCrew.getRank());
    }

    @Test
    public void crewMemberHasName(){
        assertEquals("James", cabinCrew.getCrewMemberName());
    }

}
