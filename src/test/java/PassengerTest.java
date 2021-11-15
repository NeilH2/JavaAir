import people.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Betty", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Betty", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }


}
