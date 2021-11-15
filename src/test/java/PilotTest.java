import people.Pilot;
import people.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){ pilot = new Pilot("James", Rank.CAPTAIN, "HYDTSHA5"); }

    @Test
    public void hasName(){ assertEquals("James", pilot.getName()); }

    @Test
    public void hasRank(){ assertEquals(Rank.CAPTAIN, pilot.getRank()); }

    @Test
    public void hasPilotLicenceNum(){ assertEquals("HYDTSHA5", pilot.getPilotLicenceNum()); }

    @Test
    public void canFlyPlane(){
        assertEquals("This is your Captain speaking, we are ready for take off", pilot.flyPlane());
    }
}
