package Aula02;

import java.util.Scanner;

public class Exercicio08 {

    //Escreva um programa que, dados dois números inteiros,
    // mostre na tela o maior deles, assim como a diferença existente entre ambos.

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## Qual o maior entre os numeros digitados ##");
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNunmero = teclado.nextInt();


        if (primeiroNumero > segundoNunmero){
            int total1 = primeiroNumero - segundoNunmero;
            System.out.printf("O maior numero digitado é: %d, e a diferença é de %d", primeiroNumero, total1);
        }else if (primeiroNumero == segundoNunmero){
            System.out.printf("Os numero são iguais");
        }else{
            int total2 = segundoNunmero - primeiroNumero;
            System.out.printf("O maior numero digitado é %d, e sua diferança é de %d", segundoNunmero, total2);
        }
        teclado.close();
    }
}
