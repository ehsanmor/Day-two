package airport;

public class Airport {

    private String name;
    private Airplane[] airplanes;

    public Airport(Airplane airplane1, Airplane airplane2, Airplane airplane3) {
        airplanes = new Airplane[3];
        airplanes[0] = airplane1;
        airplanes[1] = airplane2;
        airplanes[2] = airplane3;
    }

    public void printAirplanes() {
        //
        System.out.println("there are " + airplanes.length + " in the airport.");
        //
        for (int i = 0; i < airplanes.length; i++) {
            System.out.println("plane number " + i + " is: " + airplanes[i].getPlaneIdentification());
        }
    }

    public boolean requestingForEmptyRoomPlane(int planeIndex) {
        Airplane airplane = airplanes[planeIndex];
        if (airplane == null || airplane.isCurrentlyFlying() || airplane.getCurrentNumberOfPasenger() >= airplane.getMaxNumberOfPassenger())
            return false;
        return true;
    }

    public void loadPassengerInPlan(int indexPlane, int passengerNumber) {
        Airplane airplane = airplanes[indexPlane];
        //
        if (airplane == null) {
            System.out.println("there is no plane in this index");
            return;
        }
        airplane.loadPassengersWithNumberOfPassengers(passengerNumber);
        airplanes[indexPlane]=airplane;
    }
}
