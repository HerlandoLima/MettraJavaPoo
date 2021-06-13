package Aula02;

import java.util.Scanner;

public class Exercicio04 {

    /*4. Receba a altura do degrau de uma escada e a altura que o usuário deseja alcançar
    subindo a escada. Calcule e mostre quantos degraus o usuário deverá subir para atingir seu objetivo. */

    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("## CALCULADOR DE DEGRAIS ##");
        System.out.print("Digite a altura do degraus em cm: ");
        float alturaDegrau = teclado.nextFloat();
        System.out.print("Digita a altura da escada em m: ");
        float alturaEscada = teclado.nextFloat();

        float Total = (alturaEscada * 100) / alturaDegrau;

        System.out.printf("\nA quantidade de degraus dessa escada é %.0f\n", Total);

        teclado.close();
    }
}
