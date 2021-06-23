package Aula04;

import java.util.Scanner;

public class Exercicio03 {

    /*
    03. Ler um conjunto de números reais, armazenando-o em vetor e calcular o quadrado dos componentes deste vetor,
    armazenando o resultado em outro vetor. Os conjuntos tem 10 elementos cada. Imprimir todos os conjuntos no fim da execução.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("## VALORES E SEU QUADRADO ##");
        float[] numerosLidos = new float[5];
        float[] quadrado = new float[5];

        for (int i = 0;i < numerosLidos.length; i++){
            System.out.print("Entre com o valor: ");
            numerosLidos[i] = teclado.nextFloat();

            quadrado[i] = numerosLidos[i] * numerosLidos[i];
        }

        System.out.println("\nNumeros lidos:");
        for (float valor : numerosLidos){
            System.out.println(valor);
        }

        System.out.println("\nCom o for normal");
        for ( int i = 0; i < numerosLidos.length; i++){
            System.out.println(numerosLidos[i]);
        }

        System.out.println("\nQuadrado");
        for (float valor : quadrado){
            System.out.println(valor);
        }

        teclado.close();
    }
}
