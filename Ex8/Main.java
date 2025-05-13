public class Main {
    public static void main(String[] args) {
        RoutePlanner planner = new RoutePlanner();

        planner.setRouteStrategy(new FastestRouteStrategy());
        Route route1 = planner.planRoute("Av. Paulista", "USP");
        printRoute("Fastest", route1);

        planner.setRouteStrategy(new EcoFriendlyStrategy());
        Route route2 = planner.planRoute("Av. Paulista", "USP");
        printRoute("EcoFriendly", route2);
    }

    public static void printRoute(String label, Route route) {
        System.out.println(label + " Route:");
        System.out.println("Time: " + route.getEstimateTime() + " min");
        System.out.println("Distance: " + route.getDistance() + " km");
        System.out.println("Cost: R$" + route.getEstimateCost());
        System.out.println("CO2: " + route.getEstimateCO2Emission() + " toneladas");
        System.out.println("--------------------------");
    }
}