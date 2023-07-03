package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Double n1,n2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo numero:");
        n2 = scan.nextDouble();

        System.out.println("A subtração de "+n1+" - "+n2+" é igual a "+(n1-n2));
    }
}
