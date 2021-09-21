package airport;

public class Application {
    public static void main(String[] args) {

        Airplane abc123=new Airplane("ABC123",23);
        Airplane ddd888=new Airplane("DDD888",33);
        Airplane fff888=new Airplane("FFF888",36);

        Airport airport=new Airport(abc123,ddd888,fff888);
        airport.printAirplanes();
        airport.loadPassengerInPlan(1,10);
        ddd888.setCurrentlyFlying(true);
        airport.requestingForEmptyRoomPlane(1);

    }

}
