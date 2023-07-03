package PriemeirosExerciciosJava.testes;

import java.util.Scanner;

//15. Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit. Sabe-se que 𝐹 =((9 × 𝐶)/5) + 32
public class Questao15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Celsus,Fahrenheit;

        System.out.println("Digite uma temperatura em Celsus: ");
        Celsus=scan.nextDouble();

        Fahrenheit = ((9*Celsus)/5)+32;

        System.out.println("A temperatura convertida para Fahrenheit é "+Fahrenheit);
    }
}
