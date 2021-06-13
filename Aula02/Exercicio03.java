package Aula02;

import java.util.Date;
import java.util.Scanner;

public class Exercicio03 {

    /*  3. Implemente um programa que calcule o ano de nascimento de uma pessoa a
    partir de sua idade e do do ultimo aniversário.*/
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## CALCULADOR DE IDADE ##");
        System.out.print("Digite sua idade: ");
        int dataNasc = teclado.nextInt();
        System.out.print("Digite o ultimo ano que fez aniversário: ");
        int anoAtual = teclado.nextInt();

        int Total = anoAtual - dataNasc;

        System.out.printf("Você nasceu em: %d", Total);

        teclado.close();
    }
}
