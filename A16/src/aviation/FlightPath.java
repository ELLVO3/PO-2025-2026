package aviation;

public record FlightPath(String flightNumber, String departureAirport, String arrivalAirport) {
    public FlightPath {
        if(flightNumber == null || flightNumber.isEmpty()){
            throw new IllegalArgumentException("flightNumber nie może być nullem lub być pusty.");
        }
    }

    public boolean isLongHaul(){
        if(flightNumber.length() > 5) return true;
        return false;
    }

    public void printDetails(){
        System.out.println("Flight number: " + flightNumber + "\n" +
                "Departure Airport: " + departureAirport + "\n" +
                "Arrival Airport: " + arrivalAirport + "\n");
    }
}
