import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int planetClassIndex = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[planetClassIndex];
    }

    String randomShipRegistryNumber() {
        int starshipNumber = random.nextInt(1000, 10000);
        return String.format("NCC-%d", starshipNumber);
    }

    double randomStardate() {
        return random.nextDouble(41000.0, 42000.0);
    }
}
