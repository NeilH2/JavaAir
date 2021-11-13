import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("James", 2);
    }

    @Test
    public void hasName() {
        assertEquals("James", passenger.getName());
    }

    @Test
    public void hasLuggage(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}

