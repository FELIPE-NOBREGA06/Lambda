package Lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "Impar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> empolgado = valor -> valor + "!!!!";

        Function<String, String> duvida = valor -> valor + "???";


        Function<String, String> oResultadoE = valor -> "O resultado e " + valor;

        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
        System.out.println(resultadoFinal);

        String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);
        System.out.println(resultadoFinal2);

    }
}
