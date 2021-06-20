package Aula03;

import java.util.Scanner;

public class Exercicio05 {

    //5. Faça um programa que leia um número inteiro positivo n e calcule a soma dos n primeiros números naturais.

    public static void main (String[] agrs){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## SOMA DOS N INTERIROS POSITIVOS ##");
        System.out.print("Digite quala quantidade de múmeros: ");
        int qtdNumeros = teclado.nextInt();

        if(qtdNumeros < 0){
            System.out.println("Quantidade Inválida");
            return;
        }
        int soma = 0;
        for (int i = 0; i < qtdNumeros; i++){
            soma += i;
        }
           System.out.printf("A soma dos %d inteiros positivo é %d", qtdNumeros, soma);
        teclado.close();
    }
}
