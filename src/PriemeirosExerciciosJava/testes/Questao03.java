package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Double n1,n2,n3,med;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = scan.nextDouble();
        System.out.println("Digite a terceira nota:");
        n3 = scan.nextDouble();

        med = (n1+n2+n3)/3;

        System.out.println("A média do aluno é "+med);
    }
}
