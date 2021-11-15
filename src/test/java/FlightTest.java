import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import people.Rank;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;


    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    ArrayList<Pilot> pilots;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;

    @Before
    public void before(){

        pilot1 = new Pilot("Dave", Rank.CAPTAIN, "HYDTSHA5");
        pilot2 = new Pilot("James", Rank.FIRST_OFFICER, "LISCENCE8");

        cabinCrewMember1 = new CabinCrewMember("Betty", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Norah", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Kim", Rank.FLIGHT_ATTENDANT);


        passenger1 = new Passenger("John", 2);
        passenger2 = new Passenger("Jamie", 4);
        passenger3 = new Passenger("Max", 1);
        passenger4 = new Passenger("George", 0);
        passenger5 = new Passenger("Bridget", 3);


        pilots = new ArrayList<>();
        cabinCrewMembers = new ArrayList<>();
        passengers = new ArrayList<>();

        flight = new Flight(PlaneType.Cessna, "JF23", "GLA", "EDN", 10.00);
    }

    @Test
    public void hasPilots(){
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        assertEquals(2, flight.getNumberOfPilots());
    }

    @Test
    public void hasCabinCrewMembers(){
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
        assertEquals(3, flight.getNumberOfCabinCrewMember());
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.Cessna, flight.getPlaneType());
    }

    @Test
    public void planeStartsEmpty(){
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void passengerCanBookFlight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(4, flight.getNumberOfPassengers());
    }

    @Test
    public void cantExceedCapacity(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        assertEquals(4, flight.getNumberOfPassengers());
    }

    @Test
    public void numOfSeatsAvailable(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(1, flight.getNumberOfSeatsAvailable());
    }


    @Test
    public void hasFlightNumber(){
        assertEquals("JF23", flight.getFlightNumber());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDN", flight.getDepartureAirport());
    }

    @Test
    public void hasDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals(10.00, flight.getDepartureTime(), 0.0);
    }
}
