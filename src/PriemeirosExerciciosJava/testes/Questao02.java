package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Double n1,n2,divisao;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo número:");
        n2 = scan.nextDouble();

        divisao = n1/n2;
        System.out.println("A divisão de "+n1+" por "+n2+" é igual a "+divisao);
    }
}
