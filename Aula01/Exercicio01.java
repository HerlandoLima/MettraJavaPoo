package Aula01;

import java.util.Scanner;

public class Exercicio01 {

        // 01. Faça um programa que leia um número inteiro e o imprima

        public static void main(String[] args) {
            System.out.println("Óla querido usuário, digite um número: ");
            Scanner teclado = new Scanner(System.in);

            int inteiroLido = teclado.nextInt();

            System.out.printf("\nO número lido foi: %d", inteiroLido);


        }
    }
