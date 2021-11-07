package Utilities;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Range {
    public static List<Double> range(double lower, double upper, int bins) {
        double stepSize = (upper - lower) / bins;
        IntStream intStream = IntStream.range(0, bins+1);
        return intStream.asDoubleStream().map(i-> i*stepSize + lower).boxed().collect(Collectors.toList());
    }
}
