package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario;

        System.out.println("Digite o salário do funcionário: ");
        salario = scan.nextDouble();

        salario=(salario*1.05);

        salario=salario*0.93;

        System.out.println("O salário a receber do funcionário, considerando um acrecimo de 5% do salário base e um desconto de 7% do salário total, é igual a R$"+salario);

    }
}
