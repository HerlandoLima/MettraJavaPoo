package Aula03;

import java.util.Scanner;

public class Exercicio08 {
        /* 8. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
        Um número primo é aquele que é divisível somente por ele mesmo e por 1.*/

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("## DESCOBRIDOR DE PRIMOS ##");
        System.out.println("Digite um número inteiro e eu te direi se ele é ou não primo. ");
        int numeroLido = teclado.nextInt();

        // resto da divisão tem que ser 0.

        int contador = 0;
        for (int i = numeroLido - 1; i > 1; i--){

            if (numeroLido % i==0){
                contador++;
                break;
            }
        }

        if (contador > 0){
            System.out.println("Não é primo!");
        }else {
            System.out.println("É primo!");
        }
        teclado.close();
    }
}
