package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute {
        if(routeNumber == null || routeNumber.isEmpty()){
            throw new IllegalArgumentException("routeNumber nie może być nullem bądź być pusty.");
        }
    }
    public boolean isLongRoute(){
        if(routeNumber.length() > 4){
            return true;
        }
        return false;
    }
    public void printDetails(){
        System.out.println("Route number: " + routeNumber + "\n" +
                "Start Location: " + startLocation + "\n" +
                "End Location: " + endLocation + "\n");
    }
}
