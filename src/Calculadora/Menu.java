package Calculadora;

import java.util.ArrayList;
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
    String menu = "N";
    public void realizarOperacoes() {
        int operacao = iniciarCalculadora();
        do {
            obterNumero(numeros, contador);
            contador++;
            menu = validarOperacao(contador, menu);
        } while (menu.equals("N"));
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
        System.out.println("Digite a operação desejada: \n1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão");
        return scanner.nextInt();
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
        }
        return 0;
    }

}
