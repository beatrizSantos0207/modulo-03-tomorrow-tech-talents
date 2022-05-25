package Calculadora;

import java.util.List;

public interface ICalculo {

    double calcular(double valor1, double valor2);
    double calcularLista(List<Double> numeros);
}
