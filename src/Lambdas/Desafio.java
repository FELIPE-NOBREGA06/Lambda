package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.valueOf(String.format(java.util.Locale.US, "%.2f", preco));
        Function<Double, String> formatado = preco -> ("R$ " + preco).replace(".", ",");

        Produto p = new Produto("IPAD", 3235.89, 0.13);

        String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatado).apply(p);
        System.out.println("O preco Final é " + preco);

    }
}
