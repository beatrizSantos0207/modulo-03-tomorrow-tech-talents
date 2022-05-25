package Calculadora;

public class Teste {
    static Menu menu = new Menu();

    public static void main(String[] args) {
        menu.realizarOperacoes();

        Soma soma = new Soma();
        System.out.println(soma.calcular(25, 45));


        Subtracao subtracao = new Subtracao();
        System.out.println(subtracao.calcular(25, 45));

        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println(multiplicacao.calcular(25, 45));

        Divisao divisao = new Divisao();
        System.out.println(divisao.calcular(25, 45));

    }
}
