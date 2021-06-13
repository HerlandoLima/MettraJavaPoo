package Aula02;

import java.util.Scanner;

public class Exercicio09 {

    //9. Leia o salário de um trabalhador e o valor da prestação de um empréstimo.
    // Se a prestação for maior que 20% do salário imprima:"Empréstimo não concedido",
    // caso contrário imprima: "Empréstimo concedido"

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("## Empreétimo ##");
        System.out.print("Digite o valor do seu salário: ");
        float salario = teclado.nextFloat();
        System.out.print("Digite o valor do emprestimo: ");
        float valorPretendido = teclado.nextFloat();
        System.out.print("Quantas vezes deseja parcelar: ");
        int parcela = teclado.nextInt();

        float prestacao = valorPretendido / parcela;
        float emprestimo = (salario / 100) * 20f;

        if (prestacao > emprestimo){
            System.out.printf("Empréstimo não concedido");
        }else {
            System.out.printf("Empréstimo concedido");
        }
        teclado.close();
    }
}
