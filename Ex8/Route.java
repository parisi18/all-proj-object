public class Route {
    private int estimateTime; // in minutes
    private int distance; // in kms
    private int estimateCost; // em reais
    private int estimateCO2Emission; // em toneladas

    public void setEstimateTime(int estimateTime) {
        this.estimateTime = estimateTime;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setEstimateCost(int estimateCost) {
        this.estimateCost = estimateCost;
    }

    public void setEstimateCO2Emission(int estimateCO2Emission) {
        this.estimateCO2Emission = estimateCO2Emission;
    }

    public int getEstimateTime() {
        return this.estimateTime;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getEstimateCost() {
        return this.estimateCost;
    }

    public int getEstimateCO2Emission() {
        return this.estimateCO2Emission;
    }
}
