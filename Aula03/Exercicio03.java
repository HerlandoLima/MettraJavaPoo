package Aula03;

import java.util.Scanner;

public class Exercicio03 {
    // 03. Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("## MAIOR E MENOR ##");

        int maior = Integer.MIN_VALUE; // Qualquer numero será maior que o minimo
        int menor = Integer.MAX_VALUE; // Qualquer numero será menor que o maximo

        for (int i = 0;i < 4;i++ ){

            System.out.print("Digite um valor: ");
            int valorlido = teclado.nextInt();

            if (valorlido > maior ){
                maior = valorlido;
            }

            if (valorlido < menor ){
                menor = valorlido;
            }
        }
        System.out.printf("\nO maior valor lido foi: %d\n" +
                "O menor valor lido foi: %d",maior, menor);
        teclado.close();
    }
}
