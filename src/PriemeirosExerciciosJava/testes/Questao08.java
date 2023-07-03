package PriemeirosExerciciosJava.testes;

import java.util.Scanner;
//8. Faça um programa que calcule e mostre a área de um triângulo. Sabese que: Área = (base x altura) / 2. A base e altura devem ser informadas
//pelo usuário.
public class Questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base,altura,area;

        System.out.println("Infome a altura do triângulo(m):");
        altura=scan.nextDouble();
        System.out.println("Informe a base do triângulo(m):");
        base=scan.nextDouble();

        area=(base*altura)/2;

        System.out.println("A área do triângulo é "+area+" m²");
    }
}
