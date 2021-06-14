package Aula03;

import java.util.Scanner;

public class Exercicio02 {

    /* 02. Faça um programa que leia n inteiros e imprima sua média. */
    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## MEDIA DE N INTEIROS ##");
        System.out.print("De quantos você quer tirara média? "); // Quantidade em que o programa vai pedir a soma.
        int qtdNumeros = teclado.nextInt();

        int soma = 0;
        for (int i = 0; i < qtdNumeros; i++){

            System.out.print("Digite um número: "); // Números que seram somados para tirar a média.
            soma += teclado.nextInt();

        }

        float media = soma / (float) qtdNumeros;
        System.out.printf("A média dos números lidos foi: %.2f", media);
        teclado.close();
    }
}
