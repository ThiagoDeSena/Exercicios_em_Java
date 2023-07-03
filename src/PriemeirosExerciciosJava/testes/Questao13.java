package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

//13. Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber seguindo estas regras:
//a. a hora trabalhada vale um décimo do salário mínimo;
//b. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//c. o imposto equivale a 3% do salário bruto;
//d. o salário a receber equivale ao salário bruto menos o imposto.
public class Questao13 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double salarioMinimo,nMinutosTrabalhados,nHorasTrabalhadas,valorHoraTrabalhada,
        salarioBruto,salarioReceber;


        System.out.println("Digite o número de horas trabalhadas(somente as horas!):");
        nHorasTrabalhadas = scan.nextDouble();
        System.out.println("Digite o número de minutos trabalhados(somente os minutos!):");
        nMinutosTrabalhados=scan.nextInt();
        System.out.println("Digite o Valor do salário Mínimo(R$):");
        salarioMinimo=scan.nextDouble();

        nMinutosTrabalhados = nMinutosTrabalhados/60;
        nHorasTrabalhadas += nMinutosTrabalhados;
        valorHoraTrabalhada = 0.1*salarioMinimo;
        salarioBruto = nHorasTrabalhadas*valorHoraTrabalhada;
        salarioReceber= salarioBruto*0.97;

        System.out.println("O salário a Receber, considerando um imposto de 3%, é igual a R$"+salarioReceber+" por dia");


    }
}
