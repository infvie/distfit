package Statistics;

import java.util.List;

public class Stats {

    public static double var(List<Double> sample) {
        double mean = sample.stream().reduce(0.0, Double::sum) / sample.size();
        return sample.stream().map(i -> mean-i).map(i -> i*i).mapToDouble(i -> i).average().getAsDouble();
    }

    public static double std(List<Double> sample) {
        return Math.sqrt(var(sample));
    }
}
