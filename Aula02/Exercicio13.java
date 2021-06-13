package Aula02;

import java.util.Scanner;

public class Exercicio13 {

    /* 13. Faça um programa para a leitura de duas notas parciais de um aluno.
     O programa deve calcular a média alcançada por aluno e apresentar:

    A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    A mensagem "Reprovado", se a média for menor do que sete;
    A mensagem "Aprovado com Distinção", se a média for igual a dez.*/

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## Média dos alunos ##");
        System.out.print("Digite a primeira nota: ");
        float primeiraNota = teclado.nextFloat();
        System.out.print("Digite a segunda note: ");
        float segundaNota = teclado.nextFloat();

        float media = (primeiraNota + segundaNota) / 2f;

        if (media >= 7 && media < 10){
            System.out.printf("Sua média é %.2f e você foi Aprovado!!!", media);
        }else if(media == 10){
            System.out.printf("Sua média é %.2f e você foi Aprovado com Distinção", media);
        }else{
            System.out.printf("Sua média é %.2f você está reprovado!!!", media);
        }
        teclado.close();
    }
}
