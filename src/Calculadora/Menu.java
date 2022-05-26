package Calculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Soma somar = new Soma();
    Subtracao subtracao = new Subtracao();
    Multiplicacao multiplicacao = new Multiplicacao();
    Divisao divisao = new Divisao();
    List<Double> numeros = new ArrayList<>();
    int contador = 1;
    String isOperacaoContinua = "N";

    public void realizarOperacoes() {
        int operacao = iniciarCalculadora();
        do {
            obterNumero(numeros, contador);
            contador++;
            isOperacaoContinua = validarOperacao(contador, isOperacaoContinua);
        } while (isOperacaoContinua.equals("N"));
        System.out.println(selecionarOperacao(operacao, numeros));
    }

    private String validarOperacao(int contador, String menu) {
        if (contador > 2) {
            System.out.println("Deseja finalizar a operação? S-> Sim ou N->Não");
            menu = scanner.next().toUpperCase();
        }
        return menu;
    }

    private void obterNumero(List<Double> numeros, int contador) {
        System.out.printf("Digite o %dº numero:", contador);
        double numero = scanner.nextDouble();
        numeros.add(numero);
    }

    public int iniciarCalculadora() {
        int opcao = 0;

        List<Integer> opcoes = Arrays.asList(1, 2, 3, 4);
        do {
            System.out.println("Digite a operação desejada: \n1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão");
            opcao = scanner.nextInt();

            if (!opcoes.contains(opcao)) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (!opcoes.contains(opcao));

        return opcao;
    }

    public double selecionarOperacao(int codigoOperacao, List<Double> numeros) {
        switch (codigoOperacao) {
            case 1:
                return somar.calcularLista(numeros);
            case 2:
                return subtracao.calcularLista(numeros);
            case 3:
                return multiplicacao.calcularLista(numeros);
            case 4:
                return divisao.calcularLista(numeros);
            default:
        }

        return 0;
    }

}
