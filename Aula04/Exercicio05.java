package Aula04;

import java.util.Scanner;

public class Exercicio05 {

    /*05. Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui*/

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("## CONTADOR DE PARES ##");
        int[] numeroLido = new int[10];

        int contadorDePares = 0;
        for (int i = 0; i < numeroLido.length; i++){
            System.out.print("Digite um valor: ");
            numeroLido[i] = teclado.nextInt();

            if(numeroLido[i] % 2 == 0){
                contadorDePares++;
            }
        }
        System.out.printf("O programa leu %d valores pares", contadorDePares);
        teclado.close();
    }
}
