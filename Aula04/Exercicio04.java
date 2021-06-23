package Aula04;

import java.util.Scanner;

public class Exercicio04 {

    /*
    04. Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois valores X e Y
    quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a soma dos valores encontrados
    nas respectivas posições X e Y.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" ## Vetor de X e Y ##");
        int [] numeroLido = new int[8];

        for (int i = 0; i < numeroLido.length; i++){
            System.out.print("Digite um valor: ");
            numeroLido[i] = teclado.nextInt();
        }
        System.out.println("\nAgora nos diga a posição dos vetores");
        System.out.print("Digite uma posisão do vetor: ");
        int posicaoX = teclado.nextInt();
        System.out.print("Digite outra posição do vetor: ");
        int posicaoY = teclado.nextInt();

        int soma = numeroLido[posicaoX] + numeroLido[posicaoY];

        System.out.printf("A soma dos valores nas posicôes %d e %d é: %d", posicaoX, posicaoY,soma);
    }
}
