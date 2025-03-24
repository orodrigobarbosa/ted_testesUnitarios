package org.example;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public int somar ( int a, int b){
        return a + b;
    }

    public int subtrair ( int a, int b){
        return a - b;
    }

    public int multiplicar ( int a, int b){
        return a * b;
    }

    public double dividir ( int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Nenhum número pode ser divido por zero");
        }
        return (double) a / b;
    }


    public double potencia ( int base, int expoente){
        if (base == 0 && expoente == 0) {
            throw new ArithmeticException("Indefinição matemática: 0^0 não pode ser calculado. Porque todo número elevado a 0 é 1");
        }
        return Math.pow(base, expoente);
    }
}