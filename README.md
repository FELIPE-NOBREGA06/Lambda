# λ Lambda — Expressões Lambda em Java

> Projeto prático para aprender **expressões lambda** e **interfaces funcionais** em Java.

---

## 📌 Sobre o Projeto

Este projeto foi desenvolvido como um **guia de estudos** sobre expressões lambda no Java 8+. Cada arquivo `.java` foca em um conceito específico, com exemplos progressivos que vão desde a criação de interfaces funcionais customizadas até o encadeamento de funções com `andThen` e `compose`.

---

## 🗂️ Estrutura das Aulas

Todos os exemplos ficam em `src/Lambdas/`. Veja o que cada arquivo ensina:

### 🔷 Interface Funcional Customizada — `Calculo.java`
Define uma interface funcional própria com o método `executar(double a, double b)`. É a base de tudo — você aprende que qualquer interface com **um único método abstrato** pode ser usada com lambda.

### 🔷 Implementação Tradicional vs Lambda — `CalculoTeste1`, `CalculoTeste2`, `CalculoTeste3`

| Arquivo | O que mostra |
|---|---|
| `CalculoTeste1` | Forma antiga: implementando a interface com classes (`Soma`, `Mutiplicar`) |
| `CalculoTeste2` | Substituindo as classes por lambdas `(x, y) -> x + y` |
| `CalculoTeste3` | Usando `BinaryOperator<T>` do próprio Java (sem precisar criar interface) |

### 🔷 Iteração com Lambda — `Foreach.java`
Mostra 4 formas de percorrer uma lista:
- `for` tradicional
- Lambda com bloco `forEach((nome) -> { ... })`
- Method Reference `System.out::println`
- Method Reference para método estático `Foreach::meuImprimir`

### 🔷 `Consumer<T>` — `Consumidor.java`
Interface que **recebe** um valor e não retorna nada. O exemplo usa uma lista de `Produto` e imprime nome, preço e o objeto inteiro com `forEach`.

### 🔷 `Supplier<T>` — `Fornecedor.java`
Interface que **fornece** um valor sem receber nada. O exemplo cria um supplier que retorna uma lista de nomes pronta.

### 🔷 `Function<T, R>` — `Funcao.java`
Interface que **transforma** um valor em outro. Inclui o uso de `.andThen()` para encadear funções: recebe um número → classifica como "par/ímpar" → formata a string → adiciona pontuação.

### 🔷 `Predicate<T>` — `Predicado.java` e `PredicadoComposicao.java`
Interface que **testa** uma condição e retorna `true` ou `false`.
- `Predicado.java`: verifica se um produto é caro após o desconto
- `PredicadoComposicao.java`: combina predicados com `.and()`, `.or()` e `.negate()`

### 🔷 `UnaryOperator<T>` — `OperadorUnario.java`
Interface para operações com **um único valor do mesmo tipo**. Demonstra o uso de `.andThen()` e `.compose()` para encadear operações matemáticas.

### 🔷 `BinaryOperator<T>` e `BiFunction<T, U, R>` — `OperadorBinario.java`
Interface para operações com **dois valores**. O exemplo calcula média e retorna se o aluno foi aprovado ou reprovado.

### 🔷 Desafio Final — `Desafio.java`
Encadeia 5 funções para calcular o preço final de um produto:
1. Aplica desconto
2. Aplica imposto municipal (se >= R$ 2.500)
3. Adiciona frete (R$ 50 ou R$ 100)
4. Arredonda para 2 casas decimais
5. Formata como `"R$ X,XX"`

### 🔷 Classes de Apoio — `Soma.java`, `Mutiplicar.java`, `Produto.java`
- `Soma` e `Mutiplicar`: implementações da interface `Calculo` usadas no exemplo antigo
- `Produto`: modelo com `nome`, `preco` e `desconto`, usado nos exemplos de Consumer, Predicate e Desafio

---

## 🛠️ Tecnologias

- **Java 8+** (necessário para expressões lambda e interfaces funcionais)
- **IntelliJ IDEA** (projeto configurado com arquivos `.iml` e `.idea`)

---

## 🚀 Como Rodar

### Pré-requisitos
- [Java JDK 8 ou superior](https://www.oracle.com/java/technologies/downloads/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recomendado) ou outra IDE Java

### Passo a passo

1. Clone o repositório:
```bash
git clone https://github.com/FELIPE-NOBREGA06/Lambda.git
```

2. Abra a pasta `Lambda` no **IntelliJ IDEA** como projeto existente.

3. Navegue até `src/Lambdas/` e abra qualquer arquivo `.java`.

4. Clique em **Run** (▶) para executar o `main` daquele arquivo.

> Cada classe tem seu próprio `main` — você pode rodar cada uma de forma independente!

---

## 💡  Ordem de Estudo

1. `Calculo.java` → entenda o conceito de interface funcional
2. `CalculoTeste1.java` → veja a forma antiga (sem lambda)
3. `CalculoTeste2.java` → veja a mesma coisa com lambda
4. `CalculoTeste3.java` → conheça o `BinaryOperator`
5. `Foreach.java` → iterar listas com lambda e method reference
6. `Consumidor.java` → `Consumer<T>`
7. `Fornecedor.java` → `Supplier<T>`
8. `Funcao.java` → `Function<T, R>` com `andThen`
9. `Predicado.java` → `Predicate<T>`
10. `PredicadoComposicao.java` → composição de predicados
11. `OperadorUnario.java` → `UnaryOperator<T>`
12. `OperadorBinario.java` → `BinaryOperator<T>` e `BiFunction`
13. `Desafio.java` → **tudo junto** em um exemplo real!

---

