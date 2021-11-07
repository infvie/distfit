package Distributions;

public class Weibull extends Distribution {
    private final double alpha;
    private final double beta;

    public Weibull(double alpha, double beta) {
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double function(double sample) {
        return -1 * alpha * Math.pow(Math.log(1-sample), 1/beta);
    }
}
