package Aula03;

import java.util.Scanner;

public class Exercicio09 {

    /*9. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("## CALCULO DE FATORIAL##");
        System.out.print("Digite um numero e eu calcularei seu fatorial: ");
        int numeroLido = teclado.nextInt();

        int fatorial = 1;
        for (int i = numeroLido; i > 1; i--){
            fatorial *= i;
        }
        if (numeroLido <= 0){
            System.out.println("Numero invalido");
        }else{
            System.out.printf("O fatorial de %d é %d",numeroLido, fatorial);
        }

    }
}
