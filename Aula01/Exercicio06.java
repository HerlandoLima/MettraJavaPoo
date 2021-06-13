package Aula01;

import java.util.Scanner;

public class Exercicio06 {

    // 06. Leia o tamanho do lado de um quadrado e imprima como resultado a sua area

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("## CALCULADOR DE AREA DE UM QUADRADO");
        System.out.print("Digite o tamanho do lado: ");
        int lado = teclado.nextInt();

        int area = lado * lado;

        System.out.printf("A área do quadrado é: %d", area);

        teclado.close();
    }
}
