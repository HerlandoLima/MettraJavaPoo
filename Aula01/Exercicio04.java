package Aula01;

import java.util.Scanner;

public class Exercicio04 {

    // 04.Leia um número real e imprima o resultado do quadrado desse número.

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## Calculadora de quadrado ##");
        System.out.print("Digite um número: ");
        float numeroLido = teclado.nextFloat();

        float quadrado = numeroLido * numeroLido;
        System.out.printf("O quadrado  de %.2f é %.2f", numeroLido, quadrado);

        teclado.close();
    }
}
