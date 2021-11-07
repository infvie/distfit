package Histogram;

import java.util.List;
import Statistics.Stats;

public class Bin {

    public static int sturge(List<Double> sample) {
        return (int) (1 + 3.322 * Math.log(sample.size()));
    }

    public static int scott(List<Double> sample) {
        return (int) (3.49 * Stats.std(sample) * Math.pow(sample.size(), -1.0/3.0));
    }

    public static int rice(List<Double> sample) {
        return (int) (2 * Math.pow(sample.size(), 1.0/3.0));
    }

}
