import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;


    @Before
    public void before() {
        pilot = new Pilot("Dave", "HAGDTEJK20");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Dave", pilot.getPilotName());
    }

    @Test
    public void hasLicenceNum(){
        assertEquals("HAGDTEJK20", pilot.getLicenceNum());
    }





}