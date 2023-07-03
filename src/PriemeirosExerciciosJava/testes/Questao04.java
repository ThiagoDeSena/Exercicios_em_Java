package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double preco;

        System.out.println("Digite o preço do produto: ");
        preco = scan.nextDouble();

        preco=preco*0.9;

        System.out.println("O preço desse produto com um desconto de 10% é igual á R$" + preco + "");
    }
}
