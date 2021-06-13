package Aula02;

import java.util.Scanner;

public class Exercicio07 {

    // 07. Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## Verificado se é positivo ou negativo");
        System.out.print("Digite o número: ");
        int numeroLido = teclado.nextInt();

        if (numeroLido >= 0){
            System.out.printf("O número digitado é: %d, esse numero é positivo", numeroLido);
        }else {
            System.out.printf("O número digitado é: %d, esse numero é negativo", numeroLido);
        }
        teclado.close();
    }
}
