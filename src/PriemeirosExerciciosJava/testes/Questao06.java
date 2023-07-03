package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario,vendas;

        System.out.println("Digite o valor do salário base do funcionário: ");
        salario = scan.nextDouble();
        System.out.println("Digite o valor das venda desse mês do funcionário: ");
        vendas = scan.nextDouble();

        salario=salario+(vendas*0.04);

        System.out.println("O salário final do funcionário com os 4% de comissão das vendas é igual a R$"+salario);
    }
}
