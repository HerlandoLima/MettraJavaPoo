package Aula02;

import java.util.Scanner;

public class Exercicio02 {

    /* 02. Leia uma velocidade em km/h ( quilometro por hora)
    e apresente-a convertida em m/s (metros por segundo). */

    //divida o valor de velocidade por 3,6
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## CONVERTER DE KM/H PARA M/S ##");
        System.out.print("Digite a velocidade em KM/H: ");
        int quilometro = teclado.nextInt();

        float conversor = quilometro / 3.6f;

        System.out.printf("O %d de quimentro convertido em M/S é %.2f", quilometro, conversor);

        teclado.close();
    }
}
