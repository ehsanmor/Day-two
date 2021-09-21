package airport;

public class Airplane {

    private String planeIdentification;
    private Integer maxNumberOfPassenger;
    private Integer currentNumberOfPasenger;
    private boolean isCurrentlyFlying;
    private float cruiseSpeed;


    public Airplane(String planeIdentification,Integer maxNumberOfPassenger) {
        this.maxNumberOfPassenger = maxNumberOfPassenger;
        this.planeIdentification = planeIdentification;
        this.isCurrentlyFlying=false;
        this.currentNumberOfPasenger=0;
    }

    public void loadPassengersWithNumberOfPassengers( int numberOfPasenger) {
        if (numberOfPasenger < maxNumberOfPassenger) {
            this.currentNumberOfPasenger = numberOfPasenger;
            System.out.println("Airplane " + this.planeIdentification +
                    " loads " + this.currentNumberOfPasenger +
                    " passengers.");
        } else {
            this.currentNumberOfPasenger =0;
            System.out.println("Airplane could fit " + maxNumberOfPassenger + " passengers and could not" +
                    numberOfPasenger + " .");
        }
    }

    public void unloadPassengers() {
        if (!planeIdentification.isEmpty() && currentNumberOfPasenger != null) {
            System.out.println("Airplane " + this.planeIdentification +
                    " unloads " + this.currentNumberOfPasenger +
                    " passengers.");
        } else {
            System.out.println("There are no passenger");
        }
    }

    public void takeOff() {
        if (isCurrentlyFlying) {
            System.out.println("Airplane " + this.planeIdentification +
                    " takes off.");
        } else {
            System.out.println("Airplane " + this.planeIdentification + " can not take off" +
                    " because we are on sky.");
        }
    }

    public void land() {
        if (!isCurrentlyFlying) {
            System.out.println("Plane " + this.planeIdentification +
                    " lands.");
        } else {
            System.out.println("Airplane " + this.planeIdentification + " can not land" +
                    " because we are on ground.");
        }
    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public Integer getMaxNumberOfPassenger() {
        return maxNumberOfPassenger;
    }

    public Integer getCurrentNumberOfPasenger() {
        return currentNumberOfPasenger;
    }

    public boolean isCurrentlyFlying() {
        return isCurrentlyFlying;
    }

    public void setCurrentlyFlying(boolean currentlyFlying) {
        isCurrentlyFlying = currentlyFlying;
    }

}


