public class RoutePlanner {
    private RouteStrategy strategy;

    public RoutePlaner() {
        this.strategy = new FastestStrategy();
    }

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public Route planRoute(String origem, String destino) {
        return strategy.planRoute(origem, destino);
    }
}
