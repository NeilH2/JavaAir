import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.Cessna);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.Cessna, plane.getType());
    }

    @Test
    public void hasCapacity(){ assertEquals(4, plane.getCapacity()); }

    @Test
    public void hasTotalWeight(){ assertEquals(2550 , plane.getTotalWeight(), 0.0); }
}
