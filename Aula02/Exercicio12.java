package Aula02;
import java.util.Scanner;

public class Exercicio12 {

    //12. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
    // sabendo que a decisão é sempre pelo mais barato.
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## Menor Valor ##");
        System.out.print("Digite o primeiro valor R$ ");
        float primeiroLido = teclado.nextFloat();
        System.out.print("Digite o segundo valor R$ ");
        float segundoLido = teclado.nextFloat();
        System.out.print("Digite o terceiro valor R$ ");
        float terceiroLido = teclado.nextFloat();

        if (primeiroLido < segundoLido && primeiroLido < terceiroLido){
            System.out.printf("A escolha mais indicada é de R$ %.2f", primeiroLido);
        }else if(segundoLido < primeiroLido && segundoLido < terceiroLido){
            System.out.printf("A escolha mais indicada é de R$ %.2f", segundoLido);
        }else if(primeiroLido == segundoLido && segundoLido == terceiroLido){
            System.out.printf("Tanto faz, todos os produtos tem o mesmo preço");
        }else{
            System.out.printf("A escolha mais indicada é de R$ %.2f", terceiroLido);
        }
        teclado.close();
    }
}
