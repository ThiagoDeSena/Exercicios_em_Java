package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

//14. Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade
//de quilowatts consumida por uma residência, calcule e mostre: a. o valor de cada quilowatt; b. o valor a ser pago por essa residência; c. o valor a ser pago com desconto de 15%.
public class Questao14 {
    public static void main(String[] args) {
        double salarioMinino,kwatts,valorpago;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salário Minímo: ");
        salarioMinino = scan.nextDouble();
        System.out.println("Digite a quantidade de quilowatts: ");
        kwatts=scan.nextDouble();

        valorpago = (salarioMinino/5)*kwatts;

        System.out.println("O valor de um quilowatt é R$"+ (salarioMinino/5));
        System.out.println("O valor a ser pago por essa residência é de R$"+valorpago);
        System.out.println("O valor a ser pago com desconto de 15% é de R$"+(valorpago*0.85));

    }
}
