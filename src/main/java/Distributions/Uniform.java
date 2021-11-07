package Distributions;

public class Uniform extends Distribution {
    private final int lowerBound;
    private final int upperBound;

    public Uniform(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public double function(double sample) {
        return (upperBound-lowerBound) * sample + lowerBound;
    }

}
