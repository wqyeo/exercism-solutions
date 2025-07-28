public class JedliksToyCar {

    private int drivenDistanceMeters = 0;
    private int batteryPercentage = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", drivenDistanceMeters);
    }

    public String batteryDisplay() {
        if (batteryPercentage <= 0) {
            return "Battery empty";
        }

        return String.format("Battery at %d%%", batteryPercentage);
    }

    public void drive() {
        if (batteryPercentage <= 0) {
            batteryPercentage = 0;
            return;
        }

        batteryPercentage -= 1;
        drivenDistanceMeters += 20;
     }
}
