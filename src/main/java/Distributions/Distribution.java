package Distributions;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;

public abstract class Distribution {
    public Random generator = new Random();

    public abstract double function(double sample);

    public DoubleStream sample(int n) {
        return Arrays.stream(generator.doubles(n).toArray()).map(this::function);
    };
}
