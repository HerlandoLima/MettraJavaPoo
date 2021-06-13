package Aula02;

import java.util.Scanner;

public class Exercicio01 {

    // 01. Leia um valor de comprimento em polegadas e apresente-o convertido em centímetros.

    // pol *2,54
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## CONVERTE POL EM CM ##");
        System.out.print("Digite o valor em polegadas: ");
        float polegada = teclado.nextFloat();

        float valorCentimetros = polegada * 2.54f;

        System.out.printf("O valor %.2f polegadas equivale à %.2f centimetros", polegada, valorCentimetros);

        teclado.close();
    }
}
