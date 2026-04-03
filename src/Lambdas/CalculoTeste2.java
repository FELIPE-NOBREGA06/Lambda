package Lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        Calculo Calc = (x, y) -> {
            return x + y;

        };
        System.out.println(Calc.executar(1, 2));

        Calc = (x, y) -> x + y;
        System.out.println(Calc.executar(1, 2));

        System.out.println(Calc.legal());
        System.out.println(Calculo.muitoLegal());
    }

}
