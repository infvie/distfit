package Distributions;

public class Triangle extends Distribution {
    private final double lower;
    private final double mid;
    private final double upper;
    private final double f;

    public Triangle(double lower, double mid, double upper) {
        this.lower = lower;
        this.mid = mid;
        this.upper = upper;
        this.f = (mid-lower) / (upper-lower);
    }

    @Override
    public double function(double sample) {
        if (sample <= f) {
            return lower + Math.sqrt(sample * (mid-lower) * (upper-lower));
        }
        return upper - Math.sqrt((1-sample) * (upper-lower) * (upper-mid));
    }
}
