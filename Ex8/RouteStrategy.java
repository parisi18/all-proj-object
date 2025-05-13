public interface RouteStrategy {
    Route planRoute(String origem, String destino);
}

class FastestRouteStrategy implements RouteStrategy {
    @Override
    public Route planRoute(String origem, String destino) {
        Route r = new Route();
        r.setEstimateTime(10);
        r.setDistance(8);
        r.setEstimateCost(25);
        r.setEstimateCO2Emission(5);
        return r;
    }
}

class ShortestRouteStrategy implements RouteStrategy {
    @Override
    public Route planRoute(String origem, String destino) {
        Route r = new Route();
        r.setEstimateTime(12);
        r.setDistance(5);
        r.setEstimateCost(18);
        r.setEstimateCO2Emission(4);
        return r;
    }
}

class CheaperRouteStrategy implements RouteStrategy {
    @Override
    public Route planRoute(String origem, String destino) {
        Route r = new Route();
        r.setEstimateTime(20);
        r.setDistance(9);
        r.setEstimateCost(10);
        r.setEstimateCO2Emission(6);
        return r;
    }
}

class EcoFriendlyStrategy implements RouteStrategy {
    @Override
    public Route planRoute(String origem, String destino) {
        Route r = new Route();
        r.setEstimateTime(18);
        r.setDistance(7);
        r.setEstimateCost(15);
        r.setEstimateCO2Emission(2);
        return r;
    }
}