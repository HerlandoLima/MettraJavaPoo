package Aula02;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Exercicio14 {

    /* 14. Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da semana
    correspondente a este número. Isto e, domingo se 1, segunda-feira se 2, e assim por diante. */

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## DIAS DA SEMANA COM SWITCH ##");
        System.out.print("Digite um número inteiro: ");
        int dia = teclado.nextInt();

        switch (dia){
            case 1:
                System.out.println("O dia é Domingo");
                break;
            case 2:
                System.out.println("O dia é Segunda");
                break;
            case 3:
                System.out.println("O dia é Terça");
                break;
            case 4:
                System.out.println("O dia é Quarta");
                break;
            case 5:
                System.out.println("O dia é Quinta");
                break;
            case 6:
                System.out.println("O dia é Sexta");
                break;
            case 7:
                System.out.println("O dia é Sabado");
                break;
            default:
                System.out.println("Número invalido");
        }
        teclado.close();
    }
}
