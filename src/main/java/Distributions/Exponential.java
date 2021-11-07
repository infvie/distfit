package Distributions;

public class Exponential extends Distribution {
    private final double scale;

    public Exponential(double scale) {
        this.scale = scale;
    }

    @Override
    public double function(double sample) {
        return -1 * Math.log(1-sample) / scale;
    }

}
