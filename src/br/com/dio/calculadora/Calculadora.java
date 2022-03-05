package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a,b;

        System.out.println("Digite o Primeiro valor: ");
        a = scan.nextFloat();
        System.out.println("Digite o Segundo valor: ");
        b = scan.nextFloat();

        float somar = somar(a, b);
        float subtrair = subtrair(a, b);
        float dividir = dividir(a, b);
        float multiplicar = multiplicar(a, b);

        System.out.println("Somar: "+somar);
        System.out.println("subtrair: "+subtrair);
        System.out.println("dividir: "+dividir);
        System.out.println("multiplicar: "+multiplicar);
    }

    public static float somar(float a, float b){
        return a+b;
    }
    public static float subtrair(float a, float b){
        return a-b;
    }
    public static float dividir(float a, float b){
        return a/b;
    }
    public static float multiplicar(float a, float b){
        return a*b;
    }
}
