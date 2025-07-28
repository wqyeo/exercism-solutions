public class CarsAssemble {

    private double getSuccessRateOfSpeed(int speed) {
        if (speed <= 4) {
            return 1;
        }

        if (speed <= 8) {
            return 0.9;
        }

        if (speed == 9) {
            return 0.8;
        }

        return 0.77;
    }

    public double productionRatePerHour(int speed) {
        return (speed * 221) * getSuccessRateOfSpeed(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (((speed * 221.0) / 60) * getSuccessRateOfSpeed(speed));
    }
}
