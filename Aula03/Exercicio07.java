package Aula03;

import java.util.Scanner;

public class Exercicio07 {

    //7. Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
    // O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar
    // todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido
    // (começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela,
    // “Intervalo de valores inválido” e o programa termina.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("## SOMA EM UM INTERVALO ##");
        System.out.print("Digite o inicio do intervalo: ");
        int inicio = teclado.nextInt();
        System.out.print("Digite o fim do intervelo: ");
        int fim = teclado.nextInt();

        if(fim <= inicio){
            System.out.println("Intervalo inválido");
            return;
        }
        int soma = 0;
        for (int i = inicio; i <= fim; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }
        System.out.printf("A soma dos valores ímpares no invervalo de %d a %d é %d", inicio,fim,soma);
        teclado.close();
    }
}
