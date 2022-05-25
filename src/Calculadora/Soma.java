package Calculadora;

import java.util.Arrays;
import java.util.List;

public class Soma implements ICalculo {
    @Override
    public double calcular(double valor1, double valor2) {
        return (valor1 + valor2);

    }

    @Override
    public double calcularLista(List<Double> numeros) {
        double somatorio = 0;

       for (Double numero : numeros) {
            somatorio = somatorio + numero;
        }

        return somatorio;
    }
}
