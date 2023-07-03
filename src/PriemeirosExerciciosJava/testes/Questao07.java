package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1,n2,n3,media;
        int peso1,peso2,peso3;

        System.out.println("Digite a 1º nota:");
        n1 = scan.nextDouble();
        System.out.println("Digite o peso da 1º nota:");
        peso1 = scan.nextInt();
        System.out.println("Digite a 2º nota:");
        n2 = scan.nextDouble();
        System.out.println("Digite o peso da 2º nota:");
        peso2 = scan.nextInt();
        System.out.println("Digite a 3º nota:");
        n3 = scan.nextDouble();
        System.out.println("Digite o peso da 3º nota:");
        peso3 = scan.nextInt();

        media= ((n1*peso1)+(n2*peso2)+(n3*peso3))/(peso1+peso2+peso3);

        System.out.println("A média do aluno é "+ media);
    }
}
