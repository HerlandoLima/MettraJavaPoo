package Aula03;

public class Exercicio04 {

    //04. Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.

    public static void main(String[] args){

        int soma = 0;
        for (int i = 1; i <= 99;i += 2){
            soma += i;
        }

        System.out.printf("A soma dos 50 primeiros números ímpares é %d", soma);
    }

}
