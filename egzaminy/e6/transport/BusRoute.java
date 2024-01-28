package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute {
        if(routeNumber==null || routeNumber.equals("")) throw new IllegalArgumentException();
    }

    public boolean isLongRoute(){
        return routeNumber.length()>4;
    }

    public void printDetails(){
        System.out.println("Route number: "+routeNumber+", from: "+ startLocation + ", to: "+endLocation);
    }
}
