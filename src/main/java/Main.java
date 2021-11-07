import Distributions.Uniform;

public class Main {
    public static void main(String[] args) {
        Uniform uniform = new Uniform(0,10);
        uniform.sample(20).forEach(System.out::println);

    }
}
