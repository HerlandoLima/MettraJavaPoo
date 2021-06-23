package Aula04;

import java.util.Scanner;

public class Exercicio07 {

    /* 07. Escreva um programa que leia 10 números inteiros e os armazene em um vetor. Imprima o vetor,
    o maior elemento e a posição que ele se encontra.*/

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("## MAIOR MENOR DETRO DE UM VETOR");
        int[] numeroLido= new int[4];

        int posMaior = 0;
        int posMenor = 0;

        for (int i = 0; i < numeroLido.length; i++){
            System.out.print("Digite um valor: ");
            numeroLido[i] = teclado.nextInt();

            if (numeroLido[i] > numeroLido[posMaior]){
                posMaior = i;
            }

            if (numeroLido[i] < numeroLido[posMenor]){
                posMenor = i;
            }
        }

        System.out.printf("O menor valor é %d e ele se encontra na posição %d\n", numeroLido[posMenor], posMenor);
        System.out.printf("O maior valor é %d e ele se encontra na posição %d\n", numeroLido[posMaior], posMaior);

        teclado.close();
    }
}
