import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;


public class Flight{

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private double departureTime;
    private int seats;

    public Flight(PlaneType planeType, String flightNumber, String destination, String departureAirport, double departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.seats = planeType.getCapacity();
    }

    public int getNumberOfPilots() {
        return pilots.size();
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public int getNumberOfCabinCrewMember() {
        return cabinCrewMembers.size();
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        cabinCrewMembers.add(cabinCrewMember);
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if(this.getNumberOfSeatsAvailable() > 0) {
            passengers.add(passenger);
        }
    }

    public PlaneType getPlaneType(){
        return planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfSeatsAvailable(){
        return seats - this.getNumberOfPassengers();
    }

}
