package Aula01;

import java.util.Scanner;

public class Exercicio03 {

    // 03.Peça ao usuario para digitar três valores inteiros e imprima a soma deles

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## SOMA DE TRÊS NÚMEROS ##");
        System.out.println("Digite três valores e eu vou imprimir a soma deles: ");

        System.out.print("Digite o primeiro número: ");
        int primeiroLido = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoLido = teclado.nextInt();

        System.out.print("Digite o terceiro número: ");
        int terceiroLido = teclado.nextInt();

        int soma= primeiroLido + segundoLido + terceiroLido;

        System.out.printf("\nA soma dos números lidos é: %d\n", soma);
    }
}
