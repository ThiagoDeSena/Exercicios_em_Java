package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        double n1,n2,n3,n4,med;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota ?");
        n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota ?");
        n2 = scan.nextDouble();
        System.out.println("Digite a terceira nota ?");
        n3 = scan.nextDouble();
        System.out.println("Digite a quarta nota ?");
        n4 = scan.nextDouble();

        med=(n1+n2+n3+n4)/4;

        System.out.println(med);
    }
}
