package Aula02;

import java.util.Scanner;

public class Exercicio11 {

    //11. Faça um Programa que leia três números e mostre o maior deles.

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println(" ## Maior entre eles ##");
        System.out.print("Digite o primeiro numero: ");
        int primeiroLido = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoLido = teclado.nextInt();
        System.out.print("Digite o terceiro número: ");
        int terceiroLido = teclado.nextInt();

        if (primeiroLido > segundoLido && primeiroLido > terceiroLido){
            System.out.printf("O maior número entres eles é: %d", primeiroLido);
        }else if (segundoLido > primeiroLido && segundoLido > terceiroLido){
            System.out.printf("O marior número entres eles é: %d", segundoLido);
        }else if (primeiroLido == segundoLido && segundoLido == terceiroLido){
            System.out.printf("Os numero são iguais");
        }else{
            System.out.printf("O maior número entres eles é:%d", terceiroLido);
        }
        teclado.close();
    }
}
