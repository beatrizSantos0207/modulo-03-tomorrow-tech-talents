package Calculadora;

import java.util.List;

public class Divisao implements ICalculo {
    @Override
    public double calcular(double valor1, double valor2) {
        return (valor1 / valor2);
    }

    @Override
    public double calcularLista(List<Double> numeros) {
        double divisao = 0;
        for (Double numero : numeros) {
            if (numeros.indexOf(numero) == 0) {
                divisao = numero;
            } else {
                divisao = divisao / numero;
            }
        }
        return divisao;
    }


}
