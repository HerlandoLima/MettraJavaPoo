package Aula02;

import java.util.Scanner;

public class Exercicio05 {
    /* 5. Faça um programa que leia o valor de um produto e imprima o valor com desconto,
    tendo em vista que o desconto oferecido. */

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("## CALCULANDO DESCONTO ##");
        System.out.print("Digite o valor do produto: ");
        float valorProduto = teclado.nextFloat();
        System.out.print("Digite o valor do desconto: ");
        float valordoDesconto = teclado.nextFloat();

        float valorComDesconto = (valorProduto /100) * valordoDesconto;
        System.out.printf("\nO valor do produto com desconto é: %.2f\n", valorComDesconto);

        teclado.close();
    }
}
