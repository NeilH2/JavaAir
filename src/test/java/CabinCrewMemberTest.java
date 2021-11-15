import people.CabinCrewMember;
import people.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){ cabinCrewMember = new CabinCrewMember("Dave", Rank.FLIGHT_ATTENDANT); }

    @Test
    public void hasName(){ assertEquals("Dave", cabinCrewMember.getName()); }

    @Test
    public void hasRank() { assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank()); }

    @Test
    public void canRelayMessagesToPassenger(){
        assertEquals("Please remain seated during take off", cabinCrewMember.relayMessagesToPassenger());
    }
}
