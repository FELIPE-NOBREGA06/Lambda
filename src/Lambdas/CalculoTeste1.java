package Lambdas;

public class CalculoTeste1 {

    public static void main(String[] args) {

        Calculo Calculo = new Soma();
        System.out.println(Calculo.executar(2, 3));

        Calculo  = new Mutiplicar();
        System.out.println(Calculo.executar(2, 3));
    }
}
