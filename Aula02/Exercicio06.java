package Aula02;

import java.util.Scanner;

public class Exercicio06 {

    //06. Faça um programa que receba dois números e mostre qual deles é o maior.
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("## COMPARADOR DE NUMEROS ##");
        System.out.print("Digite o primeiro numero: ");
        int primeroNumero = teclado.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNumero = teclado.nextInt();

        if (primeroNumero > segundoNumero){
            System.out.printf("O primeiro número digitado: %d é maior do que o segundo número digitado: %d", primeroNumero, segundoNumero);
        }else if(primeroNumero == segundoNumero){
            System.out.printf("O primeiro número digitado: %d é igual ao segundo número digitado: %d", primeroNumero, segundoNumero);
        }else{
            System.out.printf("O segundo número digitado: %d é maior do que primeiro número digitado: %d", segundoNumero, primeroNumero);
        }
        teclado.close();
    }
}
