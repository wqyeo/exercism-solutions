public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int timeSpentInOven) {
        return expectedMinutesInOven() - timeSpentInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int timeSpentInOvens) {
        return preparationTimeInMinutes(layers) + timeSpentInOvens;
    }
}
