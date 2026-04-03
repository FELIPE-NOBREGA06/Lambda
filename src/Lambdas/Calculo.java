package Lambdas;

public interface Calculo {

    public double executar(double a, double b);

    default String legal() {
        return "Legal";
    }
}
