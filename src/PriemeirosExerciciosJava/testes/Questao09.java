package PriemeirosExerciciosJava.testes;

import java.util.Scanner;
//9. Faça um programa que calcule e mostre a área de um quadrado. Sabese que 𝐴 = 𝑙𝑎𝑑𝑜2
public class Questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado,area;

        System.out.println("Digite o tamanho do lado do quadrado(m):");
        lado=scan.nextDouble();

        area = Math.pow(lado,2);

        System.out.println("A área do quadrado é igual a "+area+"m²");
    }
}
