package Aula01;

import java.util.Scanner;

public class Exercicio02 {

    // 02. Faça um programa que leia um número real e o imprima.
    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um  número real: ");
        float realLido = teclado.nextFloat();

        System.out.printf("O número lido foi: %.1f", realLido);
    }
}
