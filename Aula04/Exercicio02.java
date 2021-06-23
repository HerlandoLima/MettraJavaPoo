package Aula04;

import java.util.Scanner;

public class Exercicio02 {

    /* 02. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos.*/

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("## LER 6 VALORES ##");
    int[] valoresLidos = new int[6];

    for (int i = 0; i <valoresLidos.length; i++){

        System.out.printf("Digite um valor: ");
        valoresLidos[i] = teclado.nextInt();

    }
    System.out.println("\n\n\n\n\n\nO valores lidos foram: ");
    for (int i = 0; i < valoresLidos.length; i++ ){
        System.out.printf("\nO valor na posição  %d é %d", i, valoresLidos[i]);
    }

    System.out.println("\n\nOs valores lidos foram (foreach):");
    for (int valor : valoresLidos){
        System.out.println(valor);
    }
    teclado.close();
    }
}
