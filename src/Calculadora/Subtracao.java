package Calculadora;

import java.util.List;

public class  Subtracao implements ICalculo {

    @Override
    public  double calcular(double valor1, double valor2) {
        return (valor1 - valor2);
    }

    @Override
    public  double calcularLista(List<Double> numeros) {
        double subtracao = 0;
        for (Double numero : numeros) {
            subtracao = subtracao - numero;
        }
        return subtracao;
    }


}
