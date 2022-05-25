package Calculadora;

import java.util.List;

public class Multiplicacao implements ICalculo {
    @Override
    public double calcular(double valor1, double valor2) {
        return (valor1 * valor2);
    }

    @Override
    public double calcularLista(List<Double> numeros) {
        double multiplicacao = 1;
        for (Double numero : numeros) {
            multiplicacao = multiplicacao * numero;
        }
        return multiplicacao;
    }


}
