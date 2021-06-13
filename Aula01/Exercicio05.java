package Aula01;

import java.util.Scanner;

public class Exercicio05 {

    // 05. Leia um número real e imprima a quinta parte deste número.

    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("## Divisão ##");
        System.out.print("Digite um número real: ");
        float numeroLido = teclado.nextFloat();

        float quintaParte = numeroLido / 5f;

        System.out.printf("A quinta parte de %.2f é %.2f", numeroLido, quintaParte);

        teclado.close();
    }
}


