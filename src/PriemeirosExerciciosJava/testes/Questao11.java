package PriemeirosExerciciosJava.testes;

import java.util.Scanner;
//11. Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
//a. a idade dessa pessoa em anos;
//b. a idade dessa pessoa em meses;
//c. a idade dessa pessoa em dias (considerando que cada ano possui 365 dias);
//d. a idade dessa pessoa em semanas (cada ano possui 52 semanas).
public class Questao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoNascimento,anoAtual,idade,meses,dias,semanas;

        System.out.println("Digite o seu ano de nascimento(AAAA):");
        anoNascimento=scan.nextInt();
        System.out.println("Digite o ano atual(AAAA):");
        anoAtual=scan.nextInt();

        idade = anoAtual-anoNascimento;
        meses = idade*12;
        dias = idade*365;
        semanas = idade*52;

        System.out.println("Idade: ");
        System.out.println(idade+" anos");
        System.out.println(meses+" meses");
        System.out.println(dias + " dias");
        System.out.println(semanas+" semanas");
    }
}
