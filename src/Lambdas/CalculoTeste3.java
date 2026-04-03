package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> Calc = (x, y) -> {
            return x + y;

        };
        System.out.println(Calc.apply(1.0, 2.0));

        Calc = (x, y) -> x + y;
        System.out.println(Calc.apply(1.0, 2.0));

        BinaryOperator<Integer> calc2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calc2.apply(1, 2));

        Calc = (x, y) -> x * y;
        System.out.println(Calc.apply(2.0, 3.0));


    }
}
