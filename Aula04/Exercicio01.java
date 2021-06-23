package Aula04;

public class Exercicio01 {

    /*1. Faça um programa que possua um vetor denominado A que armazene 6 números inteiros.
        O programa deve executar os seguintes passos:
        Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
        Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela
         esta soma. Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.Mostre na tela cada valor do vetor A,
        um em cada linha.*/

    public static void main(String[] args) {

        int[] A = {1, 0, 5, -2, -5, 7};
  /*      int[] B = new int [6];
        B[0] = 1;
        B[1] = 0;
        B[2] = 5;
        B[3] = -2;
        B[4] = -5;
        B[5] = 7; */

        int soma = A[0] + A[1]+ A[5];

        System.out.printf("O valor dos vetores na posiição: 0, 1 e 5 é: %d\n", soma);

        A[4] = 100;

        System.out.println("\nEstá é a impressão com o for normal");
        for (int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }

        System.out.println("\nEsta é a impressão com o foreach");
        for (int valor : A){
            System.out.println(valor);
        }
    }

}
