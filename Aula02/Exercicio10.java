package Aula02;

import java.util.Scanner;

public class Exercicio10 {

    //10. Faça um algoritmo que calcule a média ponderada das notas de 3 provas.
    // A primeira e a segunda prova tem peso 1 e a terceira tem peso 2. Ao final,
    // mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado.
    // A nota para aprovação deve ser igual ou superior a 60 pontos.

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println(" ## média das provas ##");
        System.out.print("Digite a nota da primeiro prova: ");
        float primeiraNota = teclado.nextFloat();
        System.out.print("Digite a nota da segunda prova: ");
        float segundaNota = teclado.nextFloat();
        System.out.print("Digite a nota da terceira prova: ");
        float terceiraNota = teclado.nextFloat();

        float media = (primeiraNota * 1F + segundaNota * 1F + terceiraNota * 2F) / (1f + 1f + 2f);

        if ( media > 60){
            System.out.printf("O aluno foi aprovado com a media %.1f", media);
        }else {
            System.out.printf("O aluno foi reprovado com a media %.1f", media);
        }
        teclado.close();
    }
}
