package Aula02;

import java.util.Scanner;

public class Exercicio15 {

    /* 15. Faça um programa que mostre ao usuário um menu com 4 opções de operações matemáticas
    (as básicas, por exemplo). O usuário escolhe uma das opções e o seu programa então pede dois valores numéricos
    e realiza a operação, mostrando o resultado e saindo.*/

    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("## PRIMEIRA CALCULADORA ##");
        System.out.println("-- Digite 1 para soma --");
        System.out.println("-- Digite 2 para subtração --");
        System.out.println("-- Digite 3 para multiplicação --");
        System.out.println("-- Digite 4 para divisão --");
        System.out.print("Qual sua opcão: ");
        int opcao = teclado.nextInt();

    switch (opcao){
        case 1:
            System.out.print("Digite o primeiro valor: ");
            float primeiraSoma = teclado.nextFloat();
            System.out.print("Digite o segundo valor: ");
            float segundoSoma = teclado.nextFloat();
            float soma = primeiraSoma + segundoSoma;
            System.out.printf("A soma de %.2f e %.2f é %.2f", primeiraSoma, segundoSoma, soma);
            break;
        case 2:
            System.out.print("Digite o primeiro valor: ");
            float primeiraSub = teclado.nextFloat();
            System.out.print("Digite o segundo valor: ");
            float segundaSub = teclado.nextFloat();
            float subtracao = primeiraSub - segundaSub;
            System.out.printf("A subtração de %.2f e %.2f é %.2f", primeiraSub,segundaSub,subtracao);
            break;
        case 3:
            System.out.print("Digite o primeiro valor: ");
            float primeiraMult = teclado.nextFloat();
            System.out.print("Digite o segundo valor: ");
            float segundaMult = teclado.nextFloat();
            float multiplicacao = primeiraMult * segundaMult;
            System.out.printf("A multiplicação de %.2f e %.2f é %.2f", primeiraMult, segundaMult, multiplicacao);
            break;
        case 4:
            System.out.print("Digite o primeiro valor: ");
            float primeiraDiv = teclado.nextFloat();
            System.out.print("Digite o segundo valor: ");
            float segundaDiv = teclado.nextFloat();
            float divisao = (primeiraDiv / segundaDiv);
            System.out.printf("A divisão de %.2f e %.2f é %.2f", primeiraDiv, segundaDiv, divisao);
            break;
        default:
            System.out.printf("Opção Invalido");
        }
    teclado.close();
    }
}
