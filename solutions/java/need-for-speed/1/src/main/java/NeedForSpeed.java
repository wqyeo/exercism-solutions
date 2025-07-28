public class NeedForSpeed {

    private final int batteryDrain;
    private final int speed;

    private int distanceDrivenMeters;
    private int currentBatteryCapacityPercentage;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.batteryDrain = batteryDrain;
        this.speed = speed;

        this.distanceDrivenMeters = 0;
        this.currentBatteryCapacityPercentage = 100;
    }

    public boolean batteryDrained() {
        return currentBatteryCapacityPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDrivenMeters;
    }

    public void drive() {
        if (currentBatteryCapacityPercentage < batteryDrain) {
            return;
        }

        currentBatteryCapacityPercentage -= batteryDrain;
        distanceDrivenMeters += speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    //#region Getters

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistanceDrivenMeters() {
        return distanceDrivenMeters;
    }

    public int getCurrentBatteryCapacityPercentage() {
        return currentBatteryCapacityPercentage;
    }

    //#endregion
}